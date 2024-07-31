function editPost() {
    if (!confirm('게시글을 수정하시겠습니까?')) {
        return; // 사용자가 취소를 선택한 경우 아무 것도 하지 않습니다.
    }

    var storyId = document.querySelector('input[name="storyId"]').value;
    // window.location.href = '/story/editStory/' + storyId;
    window.location.href = '/Lee/editStory/' + storyId;

}

function deletePost() {
    if (confirm('게시글을 삭제하시겠습니까?')) {
        // 사용자가 '확인'을 선택했을 경우, 삭제 절차 진행
        var storyId = document.querySelector('input[name="storyId"]').value;

        // var userId = document.querySelector('input[name="userId"]').value; //
        // Form을 통해 POST 요청으로 서버에 삭제를 요청하도록 변경
        var form = document.createElement('form');
        form.method = 'post';
        // form.action = '/story/delete/' + storyId;
        form.action = '/Lee/delete/' + storyId;

        document.body.appendChild(form);
        form.submit();
    }
    // 사용자가 '취소'를 선택한 경우, 함수를 종료하고 아무것도 하지 않습니다.
}




// 타임리프는 서버 사이드 템플릿 엔진이라서 서버에서 HTML에 랜더링 할 때 사용.
// ajax 는 클라이언트 측에서 실행되는 친구이기 때문에 th 문법은 사용할 수 없다.
// const loginId = $('input[name="userId"]').val();


// 페이지가 처음 로드 될 때 댓글 목록 조회 함수가 실행되도록 한다.
$(document).ready(function () {
    // let boardId = document.querySelector('input[name="boardId"]').value;
    let storyId = $('input[name="storyId"]').val();
    getComments(storyId);
})

// 댓글 목록 조회 함수
function getComments(storyId) {
    $.ajax({
        method: 'get',
        url: '/comments/' + storyId,
        success: function(data) {
            let commentListArea = $('.comment-list');

            // 댓글이 작성될 해당 섹션 비우기.
            commentListArea.empty();

            // 댓글 없을 때 표시할 html
            // if (data.length === 0) {
            //     commentListArea.append(
            //         `<div class="alert alert-info">
            //              첫번째 댓글을 남겨주세요!
            //         </div>`
            //     );
            // }

            // 댓글 있을 때 목록을 뿌려줄 반복문.
            data.forEach(function(comment) {
                let buttons = '';

                // 현재 로그인된 계정과 댓글 작성자가 동일하다면 만들어줄 버튼
                // if (loginId === comment.providerId) {
                //     buttons = `
                //         <div class="comment-actions">
                //             <button onclick="updateComment(${comment.commentId})" class="btn btn-primary">수정</button>
                //             <button onclick="deleteComment(${comment.commentId})" class="btn btn-danger">삭제</button>
                //         </div>
                //     `
                // }

                buttons = `
                    <div class="comment-actions">
                        <!-- <button onclick="updateComment(${comment.userId})" class="btn btn-primary">수정</button> -->
                        <button onclick="deleteComment(${comment.userId})" class="btn btn-danger">삭제</button>
                    </div>
                `;

                // 종합적으로 뿌려줄 html
                let commentElement = `
                    <div class="comments-section">
                        <div class="comments-list">
                             <div class="comment-user">${comment.userId}  <p class="comment-content">${comment.content}</p>   </div>
                            

<!--                            // <p class="comment-content">${comment.content}</p>-->

                            <div class="comment-options"> <i class="fas fa-ellipsis-v"></i></div>
                            <!-- 수정, 삭제 버튼 -->
                            ${buttons}
                        </div>
                    </div>
                `;
                // 해당 섹션에 추가
                commentListArea.append(commentElement);
            });
        },
        error: function(data) {
            console.error(data, "불러오기 실패");
        }
    });
}

// 댓글 추가
function addStoryComment() {
    let storyId = $('input[name="storyId"]').val();
    let commentContent = $('#commentContent').val();
    // let userId = $('input[name="userId"]').val();

    // textarea 비어 있으면 경고
    if (!commentContent) {
        alert('내용을 입력하세요!');
        return;
    }

    $.ajax({
        method: 'post',
        url: '/comments',
        contentType: 'application/json',
        data: JSON.stringify({
            storyId: storyId,
            commentContent: commentContent
            // providerId: userId
        }),
        success: function(data) {
            $('#commentContent').val('');
            getComments(storyId);
        },
        error: function(data) {
            console.error(data);
        }
    });
}


//댓글 삭제
function deleteComment(commentId){

    // alert(commentId)
    // console.log(commentId)


    if(!confirm('정말로 삭제하시겠습니까?')){
        return

    }

    $.ajax({
        method : 'delete',
        url : '/comments/' + commentId,
        success:function(data) {
            console.log(data,'삭제 성공') //걍 콘솔창에서확인용
            getComments($('input[name="storyId"]').val());
        },
        error : function(data) {
            console.error(data,'삭제 실패');
        }
    })

}

// 댓글 수정 폼 생성 함수
// function createEditForm(commentId, currentContent){
//     return`
//         <div class="mb-3">
//             <textarea class="form-control comment-edit-content" rows="3">${currentContent}</textarea>
//         </div>
//         <button class="btn btn-primary" onClick="editComment(${commentId})">수정완료</button>
//         <button class="btn btn-secondary" onClick="cancelEdit()">취소</button>
//     `;
//
// }

// 수정 삭제 버튼 중 수정을 눌렀을 때
// function updateComment(commentId) {
//     // 기존 댓글 내용을 가지고 와서, 수정 폼에 넣는다.
//     let comment = $(`#comment-${commentId}`);
//     let content = comment.find('.comment-text').text()
//     comment.find('.comment-body').html(createEditForm(commentId, content))
// }

//수정 완료 버튼 눌렀을 때
// function editComment(commentId){
//     let comment = $(`#comment-${commentId}`);
//     //textarea는 속성이 두개
//     //데이터 뿌려줄 때는 text, 입려한 데이터를 가져올 대는 value
//     let updateContent = comment.find('.comment-edit-content').val()
//
//     $.ajax({
//         method : 'put',
//         url : '/comments/' + commentId,
//         contentType: 'application/json',
//         data: JSON.stringify({
//             commentContent: updateContent
//         }),
//         success : function(data) {
//             console.log('수정 성공')
//             getComments($('input[name="storyId"]').val());
//         },
//         error : function(data) {
//             console.error('수정 삭제')
//         }
//     })
// }
//취소 버튼 누른 경우
function cancelEdit(){
    getComments($('input[name="storyId"]').val());

}