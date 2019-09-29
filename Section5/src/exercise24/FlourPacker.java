package exercise24;

class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal)//1,0,5
    {
        
        //Negative Cases
        //1. If any negative return false
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        
        //2. If maximum KG available from bags is less then goal return false
        int BIGKG = 5;
        int SMALLKG = 1;
        int maxKg = (bigCount * BIGKG) + (smallCount* SMALLKG); //maxKg = 5
        if(goal > maxKg){//5 > 5 //false
            return false;
        }

        //3. If bigCount == 0 then goal must be lesser then or equal to smallCount*SMALLKG
        if (bigCount == 0){
            return (goal - (smallCount* SMALLKG)) <= 0;
        }
        
        
        //All other cases
        //1. first remove bigCount out of goal and calculate remaining goal. For that
            //a. let a variable remainingGoal
            //b. loop while (goal - BIGKG) < 0 and remove BIGKG each time from remaininGoal
        //2. if remaininGoal is greater than smallCount, return false
        
        //else return true;
        int remainingGoal = goal; // 5
        
        while(remainingGoal >= BIGKG && bigCount > 0){ //remainingGoal = 0, bigCount = 0
            remainingGoal -= BIGKG;//0
            bigCount--;//0
        }
        
        return remainingGoal - smallCount* SMALLKG <= 0;
    }
}