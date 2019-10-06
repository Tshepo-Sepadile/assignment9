package ac.za.cput.service.impl;

import ac.za.cput.domain.FourthPersonPassword;
import ac.za.cput.repository.FourthPersonPasswordRepository;
import ac.za.cput.service.FourthPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class FourthPersonPasswordServiceImpl implements FourthPersonPasswordService {

    private static FourthPersonPasswordService fourthPersonPasswordService = null;

    @Autowired
    private FourthPersonPasswordRepository fourthPersonPasswordRepository;

    private FourthPersonPasswordServiceImpl()
    {

    }

    public static FourthPersonPasswordService getFourthPersonPasswordService()
    {
        if(fourthPersonPasswordService == null) fourthPersonPasswordService = new FourthPersonPasswordServiceImpl();
        return fourthPersonPasswordService;
    }



    @Override
    public FourthPersonPassword create(FourthPersonPassword person)
    {
        return this.fourthPersonPasswordRepository.save(person);
    }

    @Override
    public FourthPersonPassword update(FourthPersonPassword person)
    {
        return this.fourthPersonPasswordRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.fourthPersonPasswordRepository.deleteById(p);
    }

    @Override
    public FourthPersonPassword read(String p)
    {
        Optional<FourthPersonPassword> optionalPerson = this.fourthPersonPasswordRepository.findById(p);
        return optionalPerson.orElse(null);
    }

    @Override
    public FourthPersonPassword retrieveById(String password)
    {
        List<FourthPersonPassword> fourthPersonPasswordList = getAll();
        for(FourthPersonPassword fourthPersonPassword : fourthPersonPasswordList){
            if(fourthPersonPassword.password().equalsIgnoreCase(password)) return fourthPersonPassword;
        }
        return null;
    }

    @Override
    public List<FourthPersonPassword> getAll() {
        return this.fourthPersonPasswordRepository.findAll();
    }

}
