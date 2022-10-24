package rikkei.academy.service.province;

import org.springframework.beans.factory.annotation.Autowired;
import rikkei.academy.model.Province;
import rikkei.academy.repository.IProvinceRepository;
import rikkei.academy.service.IGenerateService;

import java.util.Optional;

public class ProvinceServiceIMPL implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }

}
