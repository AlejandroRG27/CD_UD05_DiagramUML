public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria v1 = new Veterinaria(); 
        // Crear dos clientes
        Cliente cliente1 = new Cliente("Pepe", "Bertamirans 32", "66555855");
        Cliente cliente2 = new Cliente("Manoli", "Coruña 12", "66895855");
        // Agregar clientes a la veterinaria
        v1.agregarCliente(cliente1);
        // Crear dos animales
        Animal animal1 = new Animal("Paco", "Perro", "Labrador", cliente1);
        Animal animal2 = new Animal("Juan", "Gato", "Persa", cliente2);
        // Agregar animales a la veterinaria
        v1.agregarAnimal(animal1);
        v1.agregarAnimal(animal2);
        //Crear un veterinario
        Veterinario veterinario1 = new Veterinario("Paco", "Podologo");
        // Crear una consulta
        Consulta consulta = new Consulta("19/10/2024", "Fiebre", "Gripe", "Descanso", veterinario1);
        // Asignar la consulta a un animal
        v1.asignarConsulta(animal2, consulta);
        //Imprimir todas las consultas de los animales de la clínica 
        v1.imprimirConsultas();
    }

}