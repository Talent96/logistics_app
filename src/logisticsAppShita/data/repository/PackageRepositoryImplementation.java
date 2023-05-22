package logisticsAppShita.data.repository;

import logisticsAppShita.data.model.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoryImplementation implements PackageRepository {

    private int lastIdCreated;
    private List<Package> packages = new ArrayList<>();


    @Override
    public Package save(Package aPackage) {
        boolean isSaved = aPackage.getId() != 0;
        if(isSaved) update(aPackage); else saveNewPackage(aPackage);
        return aPackage;
    }

    private void saveNewPackage(Package aPackage) {
        packages.add(aPackage);
        aPackage.setId(generatePackageId());
        lastIdCreated++;
    }

    private int generatePackageId() {
        return lastIdCreated;
    }

    private void update(Package aPackage){
      delete(aPackage.getId());
        packages.add(aPackage);
    }

    @Override
    public void delete(Package aPackage) {
        Package.remove(aPackage);
    }

    @Override
    public void delete(int id) {
        Package foundPackage = findById(id);
        delete(foundPackage);


    }

    @Override
    public List<Package> findAll() {
        return null;
    }

    @Override
    public Package findById(int id) {
        for (Package aPackage : packages) if(aPackage.getId() == id) return aPackage;

        return null;
    }

    @Override
    public int lastIdCreated() {
        return 0;
    }

    @Override
    public int count() {
        return packages.size();
    }


}