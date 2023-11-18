package ModelElement;

import java.util.List;

import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        if (models.size() > 0)
            this.models = models;
        else
            throw new RuntimeException("Список пустой, нужна хотя бы одна модель");
        this.flashes = flashes;
        if (cameras.size() > 0)
            this.cameras = cameras;
        else
            throw new RuntimeException("Список пустой, нужна хотя бы одна камера");

        // List<Texture> textures = new ArrayList<>();
        // models.add(new PoligonalModel(textures)); <--- спросить на семинаре этот
        // момент
        // cameras.add(new Camera());

    }

    public Type method1(Type type) {
        return null;
    }

    public Type method2(Type type1, Type type2) {
        return null;
    }

}
