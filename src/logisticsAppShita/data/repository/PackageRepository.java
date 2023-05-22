package logisticsAppShita.data.repository;

import logisticsAppShita.data.model.Package;

import java.util.List;

public interface PackageRepository {

    Package save(Package aPackage);
    void delete (Package aPackage);
    void delete (int id);
    List<Package> findAll();
    Package findById(int id);
    int lastIdCreated();

    int count();
}
