
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {
    static Scanner sca = new Scanner(System.in);
    private ArrayList<Animal> listaAnimales;
    private ArrayList<Cliente> listaClientes;

    public Veterinaria() {
        listaClientes = new ArrayList<>();
        listaAnimales = new ArrayList<>();
    }

    //TODO: Completar los siguientes métodos
    public void agregarCliente(Cliente cliente) {
        
        listaClientes.add(cliente);

    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    public void asignarConsulta(Animal animal, Consulta consulta) {

        asignarConsulta(animal, consulta);
    }

    //TODO: Crear un método para imprimir todas las consultas de todas las listas de animales. De las consultas imprimir el motivo, la fecha y el diagnostico. 
    public void imprimirConsultas(){
        for (Animal animal : listaAnimales) {
            System.out.println(animal);
        }
    }
    
    //TODO: Generar getters y setters
}
