package org.example.InMemoryModel;
import java.util.ArrayList;
import java.util.List;

import org.example.ModelElements.Camera;
import org.example.ModelElements.Flash;
import org.example.ModelElements.PoligonalModel;
import org.example.ModelElements.Scene;


public class ModelStore implements iModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangeObserver> changeObservers;

    /**
     * конструктор
     * @param changeObservers
     * @throws  Exception
     */

    public ModelStore(List <iModelChangeObserver> changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0,models,flashes,cameras));
    }
    /**
     * Возвращает scena по ID
     *
     * @param ID
     * @ return
     */
    public Scene getScene(int ID){
        for (int i = 0; i < scenes.size(); i++){
            if (scenes.get(i).id == ID) {
                return scenes.get(ID);
            }
        }
        return null;
    }
    /**
     * Регистрация изменений
     * @param sender
     */
    @Override
    public void notifyChanger(iModelChanger sender) {
    }
}