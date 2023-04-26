package case_study.service;

import java.util.Map;

public interface IRead<E> {
    Map<E,Integer> read();
}
