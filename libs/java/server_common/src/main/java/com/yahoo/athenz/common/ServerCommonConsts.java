/*
 * Copyright 2020 Verizon Media
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yahoo.athenz.common;

public final class ServerCommonConsts {
    public static final String ADMIN_ROLE_NAME  = "admin";
    public static final String OBJECT_ROLE      = "role";
    public static final String USER_DOMAIN      = "user";

    public static final String USER_DOMAIN_PREFIX = "user.";

    public static final String ZTS_PROP_AWS_REGION_NAME               = "athenz.zts.aws_region_name";
    public static final String ZTS_PROP_AWS_CREDS_UPDATE_TIMEOUT      = "athenz.zts.aws_creds_update_timeout";
    public static final int ZTS_PROP_AWS_CREDS_UPDATE_TIMEOUT_DEFAULT = 900;

    // For S3ChangeLogStore
    public static final String ZTS_PROP_AWS_BUCKET_NAME = "athenz.zts.aws_bucket_name";

    // For ZMSFileChangeLogStore
    public static final String ZTS_PROP_ZMS_URL_OVERRIDE    = "athenz.zts.zms_url";
    public static final String ATHENZ_SYS_DOMAIN            = "sys.auth";
    public static final String ZTS_SERVICE                  = "zts";
    public static final String PROP_USER_DOMAIN             = "athenz.user_domain";
    public static final String PROP_ATHENZ_CONF             = "athenz.athenz_conf";
    public static final String ZTS_PROP_FILE_NAME           = "athenz.zts.prop_file";

    // for tests
    public static final String ZTS_PROP_AWS_PUBLIC_CERT = "athenz.zts.aws_public_cert";

    private ServerCommonConsts() {
    }
}
