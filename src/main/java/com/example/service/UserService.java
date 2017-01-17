package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Login;
import com.example.domain.Mstchanneluser;
import com.example.domain.Roletxn;
import com.example.domain.Userrole;
import com.example.domain.repositories.AppldataRepo;
import com.example.domain.repositories.LoginRepo;
import com.example.domain.repositories.MstchanneluserRepo;
import com.example.domain.repositories.RoletxnRepo;
import com.example.domain.repositories.UserroleRepo;
import com.example.dto.StatusInfo;
import com.example.dto.UserInfo;
import com.example.dto.UserRegDto;
import com.example.util.DemoUtil;

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
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		List<String> listOfRoles=new ArrayList<>();
		Mstchanneluser mstchanneluser =mstchanneluserRepo.findByUserId(userName);
		Userrole userrole=userroleRepo.findByUserRoleInfo(Integer.parseInt(mstchanneluser.getId().getIduser()));
	    List<Roletxn> listOfRoletxns=roletxnRepo.findByUserRoleTxnInfo(Integer.parseInt(userrole.getId().getIdrole()));
	    listOfRoletxns.forEach(roletxnsInfo->{
	    List<String> applData=new ArrayList<>();
	    applData=appldataRepo.findByUserRoleValues(roletxnsInfo.getId().getIdtxn());  
		 listOfRoles.addAll(applData);
	    });
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
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
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
	
		
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return statusInfo;
	}
	
	
	public  List<UserInfo> getAllUsers( ) throws Exception{
		logger.info(DemoUtil.Entered + new Object() {}.getClass().getEnclosingMethod().getName());
		 userInfo=new ArrayList<>();
		 List<Login> users=loginRepo.findAllUsers();
		 users.forEach(user->{
			 userInfo.add(new UserInfo(user.getEmail(), user.getPassword()));
		 });
		logger.info(DemoUtil.Exiting + new Object() {}.getClass().getEnclosingMethod().getName());
		return userInfo;
	}
	
	
}
