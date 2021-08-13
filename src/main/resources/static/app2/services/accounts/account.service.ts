import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';


import 'rxjs/add/operator/map';







@Injectable()
export class AccountsService {



 selecetd_beneficiary :any ={};

    constructor(private http: Http) {



}
    
    
    
    setSelecetd_Beneficiary(object){
     
    this.selecetd_beneficiary = object;
    
    }
    
    
    getSelecetd_Beneficiary(){
    
    return this.selecetd_beneficiary;
    
    
    }
    

    getAccounts() {
        
         return this.http.get(`/user/accountdetails/summary`)
    .map((res:Response) => res.json());
  
    }
    
    
    
    
    getDomesticTransferConfirm() {
        
         return this.http.get(`/fundtransfer/domestic-confirmation`)
    .map((res:Response) => res.json());
  
    }
    
    getLoanSummary(account){
    
      return this.http.post(`/user/loan/fetch-loan-acc-details`,account)
    .map((res:Response) => res.json());
    
    
    }
    
    
    getAllLoanDetails() {
       
    return this.http.get('/user/loan/')
    .map((res:Response) => res.json());
     
    }
    
    
      getDomesticBeneficiaryDetails() {
        
         return this.http.get(`/fundtransfer/domestic-init`)
    .map((res:Response) => res.json());
  
    }
    
    
    
      getSelecetdBen() {
        
         return this.http.get(`/fundtransfer/domestic-verification`)
    .map((res:Response) => res.json());
  
    }
    
    
      getclearingcodes() {
        
         return this.http.get(`/beneficiary/getclearingcodes`)
    .map((res:Response) => res.json());
  
    }
    
        
      getFetechMode(val) {
        
         return this.http.post(`/beneficiary/fetch-bank-address`,val)
    .map((res:Response) => res.json());
  
    }
    
   
    
    
      getAllRecords() {
       
         return this.http.get('/NonMonetaryTxn/Beneficiary')
    .map((res:Response) => res.json());
     
  
    }
     
   
    createBenefeciary(profile) {
      return this.http.post('/NonMonetaryTxn/Beneficiary', profile)
    .map((res: Response) => res.json());
  }
  
  
    validate(val) {
    
      return this.http.post('/fundtransfer/domestic', val)
     .map((res: Response) => res.json());
     
  }


   setDomesticTransfer(domestic_deatils) {
      return this.http.post('/MonetaryTxn/All', domestic_deatils)
    .map((res: Response) => res.json());
  }


   getAccountDetails(account) {
      return this.http.get('/NonMonetaryTxn/Beneficiary/'+account)
    .map((res: Response) => res.json());
  }
    
    

   getTransactionActivity(customerId: string , nbrAccount: string) {
   
   		 return this.http.get("/user/transactionactivity/lastfive/"+customerId+"/"+nbrAccount)
    .map((res:Response) => res.json());
   }
   

   

  
   
   
}