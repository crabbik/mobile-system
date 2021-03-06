package com.itacademy.jd2.lg.ms.web.converter;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.itacademy.jd2.lg.ms.dao.dbmodel.Account;
import com.itacademy.jd2.lg.ms.dao.dbmodel.AccountDetails;
import com.itacademy.jd2.lg.ms.web.dto.AccountDTO;

@Component
public class AccountFromDTOConverter implements Function<AccountDTO, Account> {
	@Override
	public Account apply(AccountDTO dto) {
		Account dbModel = new Account();
		dbModel.setId(dto.getId());
		dbModel.setEmail(dto.getEmail());
		dbModel.setPassword(dto.getPassword());
		dbModel.setRoles(dto.getRoles());
		dbModel.setCreated(dto.getCreated());
		dbModel.setModified(dto.getModified());
		AccountDetails accountDetails = new AccountDetails();
		accountDetails.setId(dto.getId());
		accountDetails.setFirstName(dto.getDetails().getFirstName());
		accountDetails.setLastName(dto.getDetails().getLastName());
		dbModel.setDetails(accountDetails);

		return dbModel;
	}

}
