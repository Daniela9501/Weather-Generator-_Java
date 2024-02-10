public class test {
public static void populateLocationProbabilities( double[] drywetProbability, double[] wetwetProbability, 
double longitude, double latitude, 
double[][] drywet, double[][] wetwet){

// COMPLETE THIS METHODE
int rowindex = -1;
for (int i = 0; i<drywet.length; i++){
if ( drywet[i][0] == longitude && drywet[i][1] == latitude){
rowindex = i;
}
}
for (int i = 0; i< 12; i++){
drywetProbability [i] = drywet [rowindex][i+2];
}
for (int i = 0; i< 12; i++){
wetwetProbability [i] = wetwet [rowindex][i+2];
}
}
}