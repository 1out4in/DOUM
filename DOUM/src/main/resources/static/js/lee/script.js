const style = document.createElement('style');
style.innerHTML = `
    .comments-section {
        margin-top: 20px;
        padding: 10px;
        border-top: 1px solid #ddd;
    }

    .comments-list {
        list-style-type: none;
        padding: 0;
    }

    .comment {
        display: flex;
        flex-direction: column;
        border-bottom: 1px solid #ddd;
        padding: 10px 0;
    }

    .comment-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 5px;
    }

    .comment-user {
        font-weight: bold;
    }

    .comment-options {
        display: flex;
        align-items: center;
    }

    .delete-button {
        background-color: transparent;
        border: none;
        color: #dc3545;
        font-size: 12px;
        cursor: pointer;
    }

    .delete-button:hover {
        text-decoration: underline;
    }

    .comment-content {
        margin-bottom: 5px;
        line-height: 1.5;
    }

    .comment-buttons {
        margin-top: 10px;
    }

    .comment-buttons button {
        background-color: transparent;
        border: 1px solid #ddd;
        padding: 5px 10px;
        cursor: pointer;
        font-size: 14px;
    }

    .comment-buttons button.edit-button {
        color: #007bff;
    }

    .comment-buttons button:hover {
        opacity: 0.8;
    }
`;
document.head.appendChild(style);
