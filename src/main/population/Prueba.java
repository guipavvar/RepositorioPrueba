class SimulatedAnnealingOptimization{

   Solution optimum=null;

   int MAX_ITERATIONS=1000, N_NEIGHBOURHS_EXPLORED =10, niterations;

   double temperature=10000;

   Solution candidata;

   Solution current;

protected Solution simulatedAnnealing(Solution sol)

{

   //Inicializamos las soluciones y el vecindario    

(1)  current=sol;

(2)  optimum=sol;

(3) current.resetNeighbourhood(); 

// Bucle Principal

(4)  niterations=0;

(5)   while(niterations<max_iterations)

   {

        // Exploramos el vecindario

(6)        for(int i=0;i<n_neighbourhs_explored;i++)

        {

(7)           candidata=current.getRandomNeighbour();

(8)           diferencia=candidata.getFitness()-current.getFitness();

            // Actualizamos el óptimo y la solución actual

(9)           if(diferencia < 0)

            {

(10)                  current = candidata;

(11)                  if(current.getFitness() < optimum.getFitness())

(12)                      optimum=current;

(13)           }else if(Random() < probAceptacion(diferencia))

(14)                current=candidata;

           

}

(15)       temperature=cooler.enfria(temperature, diferencia);

(16)       niterations++;

    }

(17)   return optimum;   

}

}
