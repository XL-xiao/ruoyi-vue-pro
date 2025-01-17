CREATE TABLE IF NOT EXISTS "bpm_user_group"
(
    "id"
    bigint
    NOT
    NULL
    GENERATED
    BY
    DEFAULT AS
    IDENTITY,
    "name"
    varchar
(
    63
) NOT NULL,
    "description" varchar
(
    255
) NOT NULL,
    "status" tinyint NOT NULL,
    "member_user_ids" varchar
(
    255
) NOT NULL,
    "creator" varchar
(
    64
) DEFAULT '',
    "create_time" timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updater" varchar
(
    64
) DEFAULT '',
    "update_time" timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "deleted" bit NOT NULL DEFAULT FALSE,
    PRIMARY KEY
(
    "id"
)
    ) COMMENT '用户组';

CREATE TABLE IF NOT EXISTS "bpm_form"
(
    "id"
    bigint
    NOT
    NULL
    GENERATED
    BY
    DEFAULT AS
    IDENTITY,
    "name"
    varchar
(
    63
) NOT NULL,
    "status" tinyint NOT NULL,
    "fields" varchar
(
    255
) NOT NULL,
    "conf" varchar
(
    255
) NOT NULL,
    "remark" varchar
(
    255
),
    "creator" varchar
(
    64
) DEFAULT '',
    "create_time" timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updater" varchar
(
    64
) DEFAULT '',
    "update_time" timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "deleted" bit NOT NULL DEFAULT FALSE,
    PRIMARY KEY
(
    "id"
)
    ) COMMENT '动态表单';
