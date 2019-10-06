package ac.za.cput.service.impl;

import ac.za.cput.domain.SecondPersonPassword;
import ac.za.cput.repository.SecondPersonPasswordRepository;
import ac.za.cput.service.SecondPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class SecondPersonPasswordServiceImpl implements SecondPersonPasswordService {

    private static SecondPersonPasswordService secondPersonPasswordService = null;

    @Autowired
    private SecondPersonPasswordRepository secondPersonPasswordRepository;

    private SecondPersonPasswordServiceImpl()
    {

    }

    public static SecondPersonPasswordService getSecondPersonPasswordService()
    {
        if(secondPersonPasswordService == null) secondPersonPasswordService = new SecondPersonPasswordServiceImpl();
        return secondPersonPasswordService;
    }



    @Override
    public SecondPersonPassword create(SecondPersonPassword person)
    {
        return this.secondPersonPasswordRepository.save(person);
    }

    @Override
    public SecondPersonPassword update(SecondPersonPassword person)
    {
        return this.secondPersonPasswordRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.secondPersonPasswordRepository.deleteById(p);
    }

    @Override
    public SecondPersonPassword read(String p)
    {
        Optional<SecondPersonPassword> optionalSecondPersonPassword = this.secondPersonPasswordRepository.findById(p);
        return optionalSecondPersonPassword.orElse(null);
    }

    @Override
    public SecondPersonPassword retrieveById(String password)
    {
        List<SecondPersonPassword> secondPersonPasswordList = getAll();
        for(SecondPersonPassword secondPersonPassword : secondPersonPasswordList){
            if(secondPersonPassword.password().equalsIgnoreCase(password)) return secondPersonPassword;
        }
        return null;
    }

    @Override
    public List<SecondPersonPassword> getAll() {
        return this.secondPersonPasswordRepository.findAll();
    }

}
