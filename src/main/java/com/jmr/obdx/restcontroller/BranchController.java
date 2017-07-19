/*package com.jmr.obdx.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.obdx.service.BranchService;
import com.jmr.obdx.service.dto.BranchInfoDto;
import com.jmr.obdx.util.Utility;

@RestController
@RequestMapping(value = "/branch")
public class BranchController {
	
	private static final Logger logger = LoggerFactory.getLogger(BranchController.class);
	
	@Autowired
	private BranchService branchService;
	
	@RequestMapping(value = "/viewallbranch", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<BranchInfoDto> getBranchDetails(Authentication authentication) {
		try {
			logger.info(Utility.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
			BranchInfoDto responceObj = branchService.getBranchDetails(authentication);
			if (responceObj.getErrorStatus()) {
				logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
				return new ResponseEntity<BranchInfoDto>(responceObj, HttpStatus.BAD_REQUEST);
			}
			logger.info(Utility.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BranchInfoDto>(responceObj, HttpStatus.OK);
		} catch (Exception exception) {
			logger.info(Utility.EXCEPTION_IN + new Object() {}.getClass().getEnclosingMethod().getName());
			return new ResponseEntity<BranchInfoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}



}
*/