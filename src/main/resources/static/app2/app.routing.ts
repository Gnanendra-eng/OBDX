import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent } from './dashboard/dashboard.component';
import { IntilizeScreenComponent } from './OwnAccount/intilize-screen.component';
import { VerificationScreenComponent } from './OwnAccount/verification-screen.component';
import { ConfirmScreenComponent } from './OwnAccount/confirm-screen.component';
import { IntiScreenComponent } from './Domestic/inti-screen.component';
import { AddPayeeFormComponent } from './Domestic/add-payee-form.component';
import { AddpayeeverfyComponent } from './Domestic/addpayeeverfy.component';

import { AddPayeeSuccessComponent } from './Domestic/add-payee-success.component';


import { DsuccessScreenComponent } from './Domestic/success-screen.component';
import { VerfyScreenComponent } from './Domestic/verfy-screen.component';
import { DomesticConfirmComponent } from './Domestic/domestic-confirm.component';
import { AccountSummary } from './accounts/account-summary';
import { TabsComponent } from './payments/tabs.component';
import { LoanDetailsComponent } from './Loans/loan-details.component';
import { LoanSummaryComponent } from './Loans/loan-summary.component';
import { LoanActivityComponent } from './Loans/loan-activity.component';
import { LoanViewAllComponent } from './Loans/loan-ViewAll.component';
import { TermDepositeDetailsComponent } from './TermDeposite/term-deposite-details.component';
import { SuccessScreenComponent } from './OwnAccount/success-screen.component';

import { TermDepositeSummaryComponent } from './TermDeposite/tabdep.component';
import { TermDepositeViewAllComponent } from './TermDeposite/TermDeposite-ViewAll.component';
import { TermDepositeActivityComponent } from './TermDeposite/TermDeposite-activity.component';



const appRoutes: Routes = [

    { path: '', redirectTo: 'userprofile', pathMatch: 'full' },    
    { path: 'userprofile', component: AccountSummary },
    { path: 'tabs', component: TabsComponent,
       children: [
                   { path: '', redirectTo: 'OwnAc-Initialize', pathMatch: 'full' },
                   { path: 'OwnAc-Initialize', component: IntilizeScreenComponent },
                   { path: 'OwnAc-verification', component: VerificationScreenComponent},
                   { path: 'OwnAc-Confirmation',component:ConfirmScreenComponent },
                   { path: 'OwnAc-Sucess',component:SuccessScreenComponent },
                  
                   { path: 'Domestic-Initialize', component: IntiScreenComponent },
                   { path: 'Domestic-verification', component: VerfyScreenComponent },
                   { path: 'Doemstic-Confirm', component: DomesticConfirmComponent },
                   { path: 'Doemstic-Success', component: DsuccessScreenComponent },
                   
                   { path: 'Domestic-AddPayee', component: AddPayeeFormComponent },
                   { path: 'Doemstic-AddVerify', component: AddpayeeverfyComponent },
                                      
                   { path: 'Domestic-AddPayeeSuccess', component: AddPayeeSuccessComponent }
                
                 ]
     } ,
     
     
     { path: 'Dashboard', component: DashboardComponent },
     { path: 'loan-details', component: LoanDetailsComponent },
     
     { path: 'loan-summary', component: LoanSummaryComponent },
     
     { path: 'loan-Activity', component: LoanActivityComponent },
     { path: 'loan-ViewAll', component: LoanViewAllComponent },
     { path: 'TerDeposite-details', component: TermDepositeDetailsComponent },
     { path: 'TerDeposite-Summary', component: TermDepositeSummaryComponent },
     { path: 'TerDeposite-ViewAll', component: TermDepositeViewAllComponent },
     { path: 'TerDeposite-Activity', component: TermDepositeActivityComponent },
    
     
      { path: '**', redirectTo: 'userprofile' }      
];

export const routing = RouterModule.forRoot(appRoutes);