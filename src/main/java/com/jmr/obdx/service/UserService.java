package com.jmr.obdx.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmr.obdx.domain.Login;
import com.jmr.obdx.domain.Mstchanneluser;
import com.jmr.obdx.domain.Roletxn;
import com.jmr.obdx.domain.Userrole;
import com.jmr.obdx.dto.StatusInfo;
import com.jmr.obdx.dto.UserInfo;
import com.jmr.obdx.dto.UserRegDto;
import com.jmr.obdx.repositories.AppldataRepo;
import com.jmr.obdx.repositories.LoginRepo;
import com.jmr.obdx.repositories.MstchanneluserRepo;
import com.jmr.obdx.repositories.RoletxnRepo;
import com.jmr.obdx.repositories.UserroleRepo;
import com.jmr.obdx.util.DemoUtil;

/***
 * @author RISHAD K
 */
@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private MstchanneluserRepo mstchanneluserRepo;
	
	@Autowired
	private UserroleRepo userroleRepo;

	@Autowired
	private RoletxnRepo roletxnRepo;

	@Autowired
	private AppldataRepo appldataRepo;
	
	
	public List<String> getUserRole(String userName ) throws Exception{
		logger.info(DemoUtil.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		List<String> listOfRoles=new ArrayList<>();
		Mstchanneluser mstchanneluser =mstchanneluserRepo.findByUserId(userName);
		Userrole userrole=userroleRepo.findByUserRoleInfo(Integer.parseInt(mstchanneluser.getId().getIduser()));
	    List<Roletxn> listOfRoletxns=roletxnRepo.findByUserRoleTxnInfo(Integer.parseInt(userrole.getId().getIdrole()));
	    listOfRoletxns.forEach(roletxnsInfo->{
	    List<String> applData=new ArrayList<>();
	    applData=appldataRepo.findByUserRoleValues(roletxnsInfo.getId().getIdtxn());  
		 listOfRoles.addAll(applData);
	    });
		logger.info(DemoUtil.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return listOfRoles;
	}
	
	
	
	
	
/*	@Autowired
	private MsttxnRepo msttxnRepo;*/
	
	
	//HashMap<Object,Object> roletxnsInfo=appldataRepo.findByUserRoleValues(Integer.parseInt(userrole.getId().getIdrole()));
//		   Msttxn listOfMsttxns=msttxnRepo.findByRoleDesc(roletxnsInfo.getId().getIdtxn());
	
	@Autowired
	private LoginRepo loginRepo;
	
	private StatusInfo statusInfo;
	
	private List<UserInfo> userInfo;
	
	public StatusInfo userRegister(UserRegDto userRegDto ) throws Exception{
		logger.info(DemoUtil.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
	
		
		logger.info(DemoUtil.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return statusInfo;
	}
	
	
	public  List<UserInfo> getAllUsers( ) throws Exception{
		logger.info(DemoUtil.ENTERED + new Object() {}.getClass().getEnclosingMethod().getName());
		 userInfo=new ArrayList<>();
		 List<Login> users=loginRepo.findAllUsers();
		 users.forEach(user->{
			 userInfo.add(new UserInfo(user.getEmail(), user.getPassword()));
		 });
		logger.info(DemoUtil.EXITING + new Object() {}.getClass().getEnclosingMethod().getName());
		return userInfo;
	}
	
	
}
