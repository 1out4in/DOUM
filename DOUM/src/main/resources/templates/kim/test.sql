select
--     title,
--     organization_id,
--     content,
--     recruit_start_date,
--     recruit_end_date,
--     location_id,
--     recruit_number,
--     volunteer_date,
--     category,
--     manager_name,
--     manager_phone_number,
--     is_adult_allowed,
--     is_teen_allowed,
    file_location
from tbl_volunteer v join tbl_organization o
on o.manager_name and o.manager_phone_number and o.file_location;