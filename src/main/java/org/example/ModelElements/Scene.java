package org.example.ModelElements;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {

        this.id = id;
        if (models.size() > 0){
            this.models = models;
        } else {
            throw new Exception ("Должна быть одна модель");
        }
        this.flashes = flashes;
        if (cameras.size() > 0){
            this.cameras = cameras;
        } else {
            throw new Exception ("Должна быть одна модель");
        }
    }
    public <T> T method1(T flash){
        return flash;
    }
    public <T, E> T method2(T model, E Flash){
        return model;
    }
    // /**
    // * заглушка
    // */
    // public Type1 method1(Type1 t) {
    // return t;
    // }

    // /**
    // * заглушка
    // */
    // public Type1 method1(Type1 t1, Type2 t2) {
    // return t1;
    // }
}
