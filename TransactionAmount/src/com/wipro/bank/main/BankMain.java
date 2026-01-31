package com.wipro.bank.main;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.service.BankService;

public class BankMain {
   public static void main(String[] args)
   {
	   BankService bankService=new BankService();
	   System.out.println(bankService.checkBalance("1234"));
	   System.out.println(bankService.checkBalance("3456"));
	   TransferBean transferBean=new TransferBean();
	   transferBean.setFromAccountNumber("1234");
	   transferBean.setAmount(200);
	   transferBean.setToAccountNumber("3456");
	   System.out.println(bankService.transfer(transferBean));
   }
}