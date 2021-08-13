export class Benefeciary {

  account_number: string;
  branch_code: string;
  payye_name: string;
  nick_name: string;
  phone_numbr: number;
  email: string;
}

export class DomesticVerification {

  payee_name: string;
  destination_acc: string;
  txn_code: INT_FUND_TRNSFR;
  source_acc: string;
  maker_id: number;
  txn_date: any;
  txn_amt: number;
  txn_comments: string;
  source_acc_bal: number;
  txn_purpose: string;
  branch_code: string;

}


