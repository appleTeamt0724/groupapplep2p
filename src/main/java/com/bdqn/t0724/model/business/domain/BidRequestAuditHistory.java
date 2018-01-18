package com.bdqn.t0724.model.business.domain;

import com.bdqn.t0724.model.base.domain.BaseAuthDomain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BidRequestAuditHistory extends BaseAuthDomain{
	public static final int PUBLISH_AUDIT = 0;//发标前审核
	public static final int FULL_AUDIT1 = 1;//满标一审
	public static final int FULL_AUDIT2 = 2;//满标二审
	private Long bidRequestId;
	private int auditType;
	public String getAuditTypeDisplay(){
		switch (this.auditType) {
		case PUBLISH_AUDIT:
			return "发标前审核";
		case FULL_AUDIT1:
			return "满标一审";
		case FULL_AUDIT2:
			return "满标二审";
		default:
			return "";
		}
	}
}
