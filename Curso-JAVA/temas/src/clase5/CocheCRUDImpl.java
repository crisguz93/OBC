package clase5;
public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Método save() ejecutado");
    }

    @Override
    public void findAll() {
        System.out.println("Método findAll() ejecutado");
    }

    @Override
    public void delete() {
        System.out.println("Método delete() ejecutado");
    }
}