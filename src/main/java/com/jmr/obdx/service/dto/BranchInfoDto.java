package com.jmr.obdx.service.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.jmr.obdx.dto.ErrorMsg;
import com.jmr.obdx.dto.StatusInfo;

public class BranchInfoDto extends StatusInfo {
	
	
	private List<AllBranch> allBranch;

	public List<AllBranch> getAllBranch() {
		return allBranch;
	}

	public void setAllBranch(List<AllBranch> allBranch) {
		this.allBranch = allBranch;
	}

	public BranchInfoDto(List<AllBranch> allBranch) {
		this.allBranch = allBranch;
	}

	public BranchInfoDto() {
		// TODO Auto-generated constructor stub
	}

	

	


	
}
