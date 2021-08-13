package com.jmr.mcx.service;
/*package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.MstBranch;
import com.jmr.obdx.service.dto.AllBranch;
import com.jmr.obdx.service.dto.BranchInfoDto;



@Service
public class BranchService {
	
	private List<AllBranch> allBranch;

	private BranchInfoDto branchInfoDto;
	
	@Autowired
	private BranchRepo branchRepo;
	 
	
	private static final Logger logger = LoggerFactory.getLogger(BranchService.class);
	
	
	public BranchInfoDto getBranchDetails(Authentication authentication){
	List<MstBranch> branchDetailsMs= branchRepo.findAllBranch();
	branchInfoDto = new BranchInfoDto();
	allBranch = new ArrayList<>();
	branchDetailsMs.stream().forEach(branchDetailsM ->{
		allBranch.add(new AllBranch(branchDetailsM.getName(), branchDetailsM.getId(), branchDetailsM.getBranchCod(), branchDetailsM.getAddress(), branchDetailsM.getContactInfo(), branchDetailsM.getCity(), branchDetailsM.getProcessingMode(), branchDetailsM.getIsactive(), branchDetailsM.getCreatedDate()));	
	});
     branchInfoDto.setAllBranch(allBranch);
     return branchInfoDto;
	}
}
*/