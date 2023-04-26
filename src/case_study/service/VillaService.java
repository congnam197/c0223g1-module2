package case_study.service;

import case_study.model.Villa;
import case_study.repository.IVillaRepository;
import case_study.repository.VillaRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IReadVilla, IAddService {
    Scanner scanner = new Scanner(System.in);
    static Map<Villa, Integer> villaServiceMap = new LinkedHashMap<>();
    IVillaRepository villaRepository = new VillaRepository();

    @Override
    public void add() {

    }

    @Override
    public Map<Villa, Integer> read() {
        villaServiceMap = villaRepository.readVilla();
        return villaServiceMap;
    }
}
