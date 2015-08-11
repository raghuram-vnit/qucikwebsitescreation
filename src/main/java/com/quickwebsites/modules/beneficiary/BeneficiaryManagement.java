package com.quickwebsites.modules.beneficiary;

import java.util.List;

import com.quickwebsites.modules.beneficiary.data.Beneficiary;

public interface BeneficiaryManagement {

	List<Beneficiary> getBeneficiaryInformation();
	
	void addNewBeneficiary(Beneficiary beneficiary);
}
