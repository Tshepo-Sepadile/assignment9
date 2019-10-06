package ac.za.cput.service.impl;

import ac.za.cput.domain.FifthPersonPassword;
import ac.za.cput.repository.FifthPersonPasswordRepository;
import ac.za.cput.service.FifthPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class FifthPersonPasswordServiceImpl implements FifthPersonPasswordService {


    private static FifthPersonPasswordService fifthPersonPasswordService = null;

    @Autowired
    private FifthPersonPasswordRepository fifthPersonPasswordRepository;

    private FifthPersonPasswordServiceImpl()
    {

    }

    public static FifthPersonPasswordService getPersonService()
    {
        if(fifthPersonPasswordService == null) fifthPersonPasswordService = new FifthPersonPasswordServiceImpl();
        return fifthPersonPasswordService;
    }



    @Override
    public FifthPersonPassword create(FifthPersonPassword fifthPersonPassword)
    {
        return this.fifthPersonPasswordRepository.save(fifthPersonPassword);
    }

    @Override
    public FifthPersonPassword update(FifthPersonPassword fifthPersonPassword)
    {
        return this.fifthPersonPasswordRepository.save(fifthPersonPassword);
    }

    @Override
    public void delete(String p)
    {
        this.fifthPersonPasswordRepository.deleteById(p);
    }

    @Override
    public FifthPersonPassword read(String p)
    {
        Optional<FifthPersonPassword> optionalFifthPersonPassword = this.fifthPersonPasswordRepository.findById(p);
        return optionalFifthPersonPassword.orElse(null);
    }

    @Override
    public FifthPersonPassword retrieveById(String password)
    {
        List<FifthPersonPassword> fifthPersonPasswords = getAll();
        for(FifthPersonPassword fifthPersonPassword : fifthPersonPasswords){
            if(fifthPersonPassword.password().equalsIgnoreCase(password)) return fifthPersonPassword;
        }
        return null;
    }

    @Override
    public List<FifthPersonPassword> getAll() {
        return this.fifthPersonPasswordRepository.findAll();
    }


}
