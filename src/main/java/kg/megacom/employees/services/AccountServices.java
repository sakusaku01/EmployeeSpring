package kg.megacom.employees.services;


import kg.megacom.employees.models.dtos.AccountDto;
import kg.megacom.employees.models.requests.AuthRequest;
import kg.megacom.employees.models.responses.Response;


public interface AccountServices extends BaseServices<AccountDto>{

    Response auth(AuthRequest authRequest);
    AccountDto getByLogin(String login);

}
