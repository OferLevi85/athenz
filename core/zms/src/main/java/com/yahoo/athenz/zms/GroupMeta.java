//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// GroupMeta - Set of metadata attributes that all groups may have and can be
// changed by domain admins.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupMeta {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean selfServe;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean reviewEnabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String notifyRoles;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String userAuthorityFilter;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String userAuthorityExpiration;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer memberExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer serviceExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer memberReviewDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer serviceReviewDays;

    public GroupMeta setSelfServe(Boolean selfServe) {
        this.selfServe = selfServe;
        return this;
    }
    public Boolean getSelfServe() {
        return selfServe;
    }
    public GroupMeta setReviewEnabled(Boolean reviewEnabled) {
        this.reviewEnabled = reviewEnabled;
        return this;
    }
    public Boolean getReviewEnabled() {
        return reviewEnabled;
    }
    public GroupMeta setNotifyRoles(String notifyRoles) {
        this.notifyRoles = notifyRoles;
        return this;
    }
    public String getNotifyRoles() {
        return notifyRoles;
    }
    public GroupMeta setUserAuthorityFilter(String userAuthorityFilter) {
        this.userAuthorityFilter = userAuthorityFilter;
        return this;
    }
    public String getUserAuthorityFilter() {
        return userAuthorityFilter;
    }
    public GroupMeta setUserAuthorityExpiration(String userAuthorityExpiration) {
        this.userAuthorityExpiration = userAuthorityExpiration;
        return this;
    }
    public String getUserAuthorityExpiration() {
        return userAuthorityExpiration;
    }
    public GroupMeta setMemberExpiryDays(Integer memberExpiryDays) {
        this.memberExpiryDays = memberExpiryDays;
        return this;
    }
    public Integer getMemberExpiryDays() {
        return memberExpiryDays;
    }
    public GroupMeta setServiceExpiryDays(Integer serviceExpiryDays) {
        this.serviceExpiryDays = serviceExpiryDays;
        return this;
    }
    public Integer getServiceExpiryDays() {
        return serviceExpiryDays;
    }
    public GroupMeta setMemberReviewDays(Integer memberReviewDays) {
        this.memberReviewDays = memberReviewDays;
        return this;
    }
    public Integer getMemberReviewDays() {
        return memberReviewDays;
    }
    public GroupMeta setServiceReviewDays(Integer serviceReviewDays) {
        this.serviceReviewDays = serviceReviewDays;
        return this;
    }
    public Integer getServiceReviewDays() {
        return serviceReviewDays;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != GroupMeta.class) {
                return false;
            }
            GroupMeta a = (GroupMeta) another;
            if (selfServe == null ? a.selfServe != null : !selfServe.equals(a.selfServe)) {
                return false;
            }
            if (reviewEnabled == null ? a.reviewEnabled != null : !reviewEnabled.equals(a.reviewEnabled)) {
                return false;
            }
            if (notifyRoles == null ? a.notifyRoles != null : !notifyRoles.equals(a.notifyRoles)) {
                return false;
            }
            if (userAuthorityFilter == null ? a.userAuthorityFilter != null : !userAuthorityFilter.equals(a.userAuthorityFilter)) {
                return false;
            }
            if (userAuthorityExpiration == null ? a.userAuthorityExpiration != null : !userAuthorityExpiration.equals(a.userAuthorityExpiration)) {
                return false;
            }
            if (memberExpiryDays == null ? a.memberExpiryDays != null : !memberExpiryDays.equals(a.memberExpiryDays)) {
                return false;
            }
            if (serviceExpiryDays == null ? a.serviceExpiryDays != null : !serviceExpiryDays.equals(a.serviceExpiryDays)) {
                return false;
            }
            if (memberReviewDays == null ? a.memberReviewDays != null : !memberReviewDays.equals(a.memberReviewDays)) {
                return false;
            }
            if (serviceReviewDays == null ? a.serviceReviewDays != null : !serviceReviewDays.equals(a.serviceReviewDays)) {
                return false;
            }
        }
        return true;
    }
}
