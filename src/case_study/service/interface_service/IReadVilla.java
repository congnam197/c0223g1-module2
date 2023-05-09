package case_study.service.interface_service;

import case_study.model.facility.VillaModel;

import java.util.Map;

public interface IReadVilla {
    Map<VillaModel,Integer> readVilla();
}
