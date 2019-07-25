/*
 * Program: RPG : McCree's Redemption
 * Student Name: Rahul
 * Student Number: 661174
 * Description: This game is a pre-quell to the massive online game Overwatch. The game includes several minigames
 * as well as epic battles. Solve puzzles and discover a vast universe in this RPG made only with words
 * and characters!
 * 
 */


public class RPG
{
  //banner and comments
  public static void main (String args[])
  {
    new RPG();
  }
  
  public RPG()
  { 
    char continu = 'y';
    int CharachterH = 100; //initializes player starting health
    Password(); //password check before player plays game
    
    while (continu == 'y' || continu == 'Y') // lets user repeat game
    {
      //my game is seperated into several method, which represent different sections of the game, as well as minigames in it
      CharachterH = 100;
      Intro(); //background information about charachters 
      Start(); //Mission is assigned and player is introduced to the battle system
      Train(); //general
      Questions();//player gets a chance to ask Reyes about the mission and Overwatch in 
      Questions2();//player gets a chance to ask Reyes about the mission and Overwatch in 
      Juice(); //First clue towards the goal, and Blackjack game
      CharachterH = Night(CharachterH); //Both characters follow the suspect to find a clue, 1 choice 
      CharachterH = Apartment(CharachterH);//After following the suspect, they find a clue in his apartment, 1 choices, 1 puzzle, 1 randomized event
      CharachterH = Castle(CharachterH);//They follow the clue to the layer of the Shimada, 4 riddles
      CharachterH = InCastle(CharachterH); // Climax of story, find the secret of the shimada, 1 dialogue option, 2 battles, 1  true of false
      if( CharachterH<= 0)
      {System.out.println("You DIED!");}
      continu = IBIO.inputChar("Play again? (y/n) ");       // asks to play again    
    }
    System.out.println(" See ya later cowboy!");
    System.out.println("Press enter to continue command: https://stackoverflow.com/questions/19870467/how-do-i-get-press-any-key-to-continue-to-work-in-my-java-code");
    System.out.println("Delay Command: https://stackoverflow.com/questions/24104313/how-to-delay-in-java");
    System.out.println("I used these websites to help me add these features to the game.");
  }
  public void Password() // makes user input password to continue, new from design document
  {
    char Correct = 'n';
    int Tries = 1;
    while (Correct == 'n' && Tries <6 ) //loops until user get password right
    { Tries++;
      String uGuess = IBIO.inputString("Enter the password: ");
      if (uGuess.equals("HighNoon")) //password: HighNoon
      {
        System.out.println("That's correct! ");
        System.out.println("");
        Correct = 'y';
      }
      else
      { 
        System.out.println("Wrong... Try again!");
        System.out.println("");
      }
      if (Tries == 5)
      { System.out.println("You are really bad at this.....");}
    }
  }
  
  public void Intro()
  {
    System.out.println("This game is better by reading, and looking around the game environment to learn more about the characters and the universe.");
    System.out.println("Without any more delay let's start the game!");
    System.out.println("");
    System.out.println("");
    System.out.println("WELCOME TO.....");
    System.out.println(" __  __       _____               _       _____          _                      _   _  ");           
    System.out.println("|  \\/  |     / ____|             ( )     |  __ \\        | |                    | | (_)   ");         
    System.out.println("| \\  / | ___| |     _ __ ___  ___|/ ___  | |__) |___  __| | ___ _ __ ___  _ __ | |_ _  ___  _ __");  
    System.out.println("| |\\/| |/ __| |    | '__/ _ \\/ _ \\ / __| |  _  // _ \\/ _` |/ _ \\ '_ ` _ \\| '_ \\| __| |/ _ \\| '_ \\ ");
    System.out.println("| |  | | (__| |____| | |  __/  __/ \\__ \\ | | \\ \\  __/ (_| |  __/ | | | | | |_) | |_| | (_) | | | |");
    System.out.println("|_|  |_|\\___|\\_____|_|  \\___|\\___| |___/ |_|  \\_\\___|\\__,_|\\___|_| |_| |_| .__/ \\__|_|\\___/|_| |_|");
    System.out.println("                                                                         | |                 ");     
    System.out.println("                                                                         |_|        ");
    
    System.out.println("");
    System.out.println("");
    pressEnterKeyToContinue(); //This function is used very frequently throughout the program, it is a function which sperates text, this allows the text to apear slower and at the user's pace
    
    
    System.out.println("Howdy, the names McCree. Man, these last few days have been ... interesting to say the least.");
    
    pressEnterKeyToContinue();
    
    System.out.println("Well, I guess I should start from the beginning.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Your boy McCree, used to be a gun trafficker, in the Deadlock Gang.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Man, I never knew what I was doing or why I did it....");
    
    pressAnyKeyToContinue();
    
    System.out.println("Recently I was caught up in a sting operation by a government force called Overwatch.");
    
    pressAnyKeyToContinue();
    
    System.out.println("After that I expected to rot away in jail, but I guess the heavens sent me another chance to repent.");
    
    pressAnyKeyToContinue();
    
    System.out.println("That chance, was for me to join Blackwatch a covert-ops branch of Overwatch.");
    
    pressAnyKeyToContinue();
    
    System.out.println("That was the start of one of the greatest adventures of my life.");
    
    pressAnyKeyToContinue();
    
    System.out.println("It all started with Commander Morrison running in the Overwatch HQ, like an idiot.");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    
    return;
  }
  
  public void Start()
  {
    Ascii(1); //The method Ascii, takes in a number. Depending on it, it prints out an Ascii art. This method helped me keep track of all of my art, it also we very easy to paste it to the screen
    //without clutteirng my main methods
    System.out.println("Overwatch HQ, several very tall white buildings, with a giant statue of Commander Morrison");
    
    pressAnyKeyToContinue();
    
    System.out.println("Morrison: *huffs* Those Shimada, they keep trying to assassinate several governmental figure heads.");
    
    pressAnyKeyToContinue();
    
    System.out.println("3 TIMES IN THE LAST WEEK REYES, I CAN'T ANYMORE");
    
    pressAnyKeyToContinue();
    
    System.out.println("Oh, is this the newbie you picked up Reyes?");
    
    pressAnyKeyToContinue();
    
    System.out.println("Before I let you into Overwatch I need to check something!");
    
    pressAnyKeyToContinue();
    
    System.out.println("Prepare to try a mock fight!");
    
    pressAnyKeyToContinue();
    
    
    BattleRules(); //Prints out the rules of the battle system in the game
    int inBattleH = Battle1(); //User does the first battle, new from the design document
    if(inBattleH<=0) //if the user lost it will print out this
    {System.out.println("I'm sure you can learn fromo this and get better. I'm sure Overwatch will make you a better sharpshooter eventually, you just need a bit of practice....");}
    else //if the user wins it prints out this
    {System.out.println("Nice job newbie, I'm sure you will continue to hone and improve your skills throughout your stay here!");}
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    System.out.println("Well then Reyes.....");
    
    pressAnyKeyToContinue();
    
    System.out.println("TAKE THE NEWBIE AND GO GET ANY INFORMATION ON THEM YOU CAN!");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    System.out.println("*Ana walks in*");
    System.out.println("Ana: Ah, you must be the new Blackwatch member, uh what was your name again? ");
    
    pressAnyKeyToContinue();
    
    System.out.println("Was it McBee, wait no.... McGee, OH WAIT I GOT IT");
    
    pressAnyKeyToContinue();
    
    System.out.println("McTree THAT'S WHAT IT WAS!");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: ...");
    System.out.println("*Reyes and Morrison laughing hysterically in the background*");
    System.out.println("McCree: Ya... sure it is.....");
    
    pressAnyKeyToContinue();
    
    System.out.println("Ana: Haha yes, I never forget a name, well then");
    System.out.println("Ana: Reyes, I heard you're going looking for the Shimada.");
    
    pressAnyKeyToContinue();
    
    System.out.println("A word of advice, don't stick your head where it shouldn't be.");
    
    pressAnyKeyToContinue();
    
    System.out.println("For you newbie, just don't die *giggles*");
    System.out.println("*Ana exits room and winks at Morrison*");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    System.out.println("Reyes: *Scoffs*, McCree we better get going *marches out of the room*");
    
    pressAnyKeyToContinue();
    
    
    
  }
  public void BattleRules() //rules for the battle system
  {
    System.out.println("");
    System.out.println("************* Battle Rules *************");
    System.out.println("In this game, there will be several fights against varying enemies...");
    System.out.println("You yourself have 4 main moves, and a clip size of 6 bullets.");
    System.out.println("Once you run out of bullets you spend a turn reloading.");
    System.out.println("Shot: Shoots enemy, 100% success rate, 20 damage, 1 bullet cost");
    System.out.println("Fan the hammer: Rapidly shoot all bullets in your clip, 10% success rate, 25 damage per bullet in clip, costs all remaining bullets in the clip.");
    System.out.println("Punch: Punch your enemy, 40% success rate, 25 damage");
    System.out.println("Flashbang: Flashbang your enemy, 30% success rate, next ability cast will do extra damage (Shoot: 50, Fan the hammer: 35, Punch: 75");
    System.out.println("After your turn the enemy will attack, you will have 2 options roll/hide");
    System.out.println("The enemy has several attacks, each can be avoided with either roll/hide, but only 1 of them will stop the damage");
    System.out.println("Deal enough damage to the enemy to win and don't die!");
    System.out.println("Good luck, if you forget any of this just type \"i\" during the move selection portion of the game.");
    System.out.println("P.S your outside health is separate from battle health (which will always start at 100 every battle)");
    System.out.println("***************************************");
    System.out.println("");
    
  }
  public void Train() //provides a description of the setting as well as Ascii
  {
    Ascii(2);//prints out Ascii art
    pressAnyKeyToContinue();
    System.out.println("We enter a huge over the top train.");
    System.out.println("Me and Reyes stick out like a sore thumb, but whatever free food!");
    pressAnyKeyToContinue();
  }
  public void Questions()// First question which the user can ask Reyes
  {
    char Questions = 'n';
    Questions = IBIO.inputChar("Reyes: So McCree, you got any questions about Overwatch? (y/n)");
    char HQ = 'N';
    //char OQ = 'N';
    char AskQ ='N'; //if the user does not ask a question it prints out something different, this variable is used to keep track of this information
    if (Questions != 'y' && Questions != 'Y' && Questions != 'N' && Questions != 'n') //if the user does not input a valid input
    {System.out.println("Reyes: Um.. I couldn't understand you so I guess you know already...");}
    while (Questions == 'y' || Questions == 'Y') //loops questions which user can ask
    {
      char Questionsp2 = IBIO.inputChar("Heros or Overwatch? (H/O)(n to quit)"); //2 branches of questions user can answer
      
      if (Questionsp2 == 'n' || Questions == 'N') //loop stopping variable, if user wants to quit
      { Questions = 'n';}
      
      if (Questionsp2 != 'h' && Questionsp2 != 'H' && Questionsp2 != 'o' && Questionsp2 != 'O'  && Questionsp2 != 'N' && Questionsp2 != 'n' ) //if user inputs an invalid answer
      { System.out.println("McCree, stop with the jibber jabber....");
        
      }
      
      while (Questionsp2 == 'h' || Questionsp2 == 'H') //the hero branch of questions
      {
        
        HQ = IBIO.inputChar("Who do you want to know about? (Ana (A)/ Reyes (R) / Morrison (M)/ Back (B)"); //the sub catagories of the Hero branch, the user can ask about any of the options
        if (HQ == 'A' || HQ == 'a')
        { 
          AskQ ='Y'; //confirms the player asked a question, this is in every question branch
          Ascii(4); // ascii of Ana
          System.out.println("Reyes: Ah, Ana, she’s a feisty one. She is currently the second in command, below me and Morrison."); //prints out description of hero
          
          pressAnyKeyToContinue();
          
          System.out.println("She is an extremely well-known sniper who fought for the freedom fighters back in Egypt.");
          
          pressAnyKeyToContinue();
          
          System.out.println("The scariest thing about her, is her drive to make the world a safer place…. She is not afraid to do anything as long as she is getting closer to her goal.");
          System.out.println("");
          
        }
        else if (HQ == 'M' || HQ == 'm')  //prints out description of hero
        {AskQ ='Y';
          Ascii(3); //Ascii of Morrison
          System.out.println("Reyes: Morrison, he was a part of the Super Soldier Program with me. We trained together and as of now he is currently my closest friend.");
          
          pressAnyKeyToContinue();
          
          System.out.println("We had to work together in order to start Overwatch and keep it alive during the crisis.");
          
          pressAnyKeyToContinue();
          
          System.out.println("He is a true model soldier, someone who believes in an ideal image of the world, and slowly works toward it.");
          
          pressAnyKeyToContinue();
          
          System.out.println ("He is a bit of a show boat, but to be honest, he just looks pretty.");
          System.out.println ("Trust me I’m not jealous of him.");
          System.out.println("");
        }
        else if (HQ == 'R' || HQ == 'r')  //prints out description of hero
        {AskQ ='Y';
          Ascii(5); // Ascii of Reyes
          System.out.println("Reyes: Oh me? well I’m a war veteran until I was asked to join the Super Soldier Program, in which I trained hard and met Morrison. ");
          
          pressAnyKeyToContinue();
          
          System.out.println("We were both asked to form a new organization to help save the world.");
          
          pressAnyKeyToContinue();
          
          System.out.println("During that time, I made friends which I will never forget. I’m not as pretty as Morrison so I handle all of the “other” stuff, but I’m fine with it as long as it’s making a difference in the world.");
          System.out.println("");
          
        }
        else if (HQ == 'B' || HQ == 'b') //exits the Hero branch of questions and goes back to the "Heros or Overwatch" question
        {Questionsp2 = 'n'; }
        else //if the user inputs an invalid input 
        { System.out.println("McCree, stop with the jibber jabber....");}
      }
      while (Questionsp2 == 'o' || Questionsp2 == 'O')// the Overwatch branch of questions
      {
        
        HQ = IBIO.inputChar("What you want to know ? (Overwatch? (O)/ Omnic Crisis (C) / Super Soldeir Program (S)/Back(B)"); // things the user can ask about
        if (HQ == 'O' || HQ == 'o') //prints out description of 
        { AskQ ='Y';
          System.out.println("Reyes: Overwatch is an organization which is tasked in ensuring world peace. During the Omnic Crisis, there was no one to look out for the people, so Overwatch was formed.");
          
          pressAnyKeyToContinue();
          
          System.out.println("We fought against the Omnics to keep the world safe. Even after the crisis, there was no real governing force to ensure safety of the people, so Overwatch took over.");
          
          pressAnyKeyToContinue();
          
          System.out.println("Overwatch is split into 2 main divisions, Overwatch and Blackwatch. Morrison runs Overwatch and talks to the public, ");
          System.out.print("I on the other hand take care of the dirty work that is not seen by the public.");
          
          pressAnyKeyToContinue();
          
          System.out.println("");
        }
        else if (HQ == 'C' || HQ == 'c') //prints out description
        { AskQ ='Y';
          System.out.println("Reyes: The Omnic Crisis was a period in time in which robots created by humans, which were previously thought to be broken started working again. ");
          
          pressAnyKeyToContinue();
          
          System.out.println("These robots started to rebel, and due to their design (Military bots), they started causing mass destruction all throughout the world. ");
          
          pressAnyKeyToContinue();
          
          System.out.println("Due to the quality of the bots, and their intelligence it was almost as if fighting against indestructible super humans.");
          System.out.println("");
        }
        else if (HQ == 's' || HQ == 'S') //prints out description
        {AskQ ='Y';
          System.out.println("Reyes: The Super soldier program was a program that took regular people and turned them into super soldiers. ");
          
          pressAnyKeyToContinue();
          
          System.out.println("The training program was rigorous, but the results were worth it as they gained super human speed, strength, agility and stamina.");
          System.out.println("Some also got implants that made them bionic, further enhancing their powers.");
          
          pressAnyKeyToContinue();
          
          System.out.println("");
        }
        else if (HQ == 'B' || HQ == 'b')
        {Questionsp2 = 'n'; } //if user wants to go back to "Hero or Overwatch?" questions
        else //if user inputs invalid input
        { System.out.println("McCree, stop with the jibber jabber....");}
      }
    }
    if (AskQ == 'N') //if user did not ask a question
    {System.out.println("Reyes: You must have read up on Overwatch HAHAHHAHAH!");}
    else //if user did ask a question
    {System.out.println("Reyes: Hope you feel a bit more informed.");}
    return;
  }
  
  public void Questions2() //second question user can ask, things about the mission in specific
  {
    char Questions2 = IBIO.inputChar("You got any questions about the mission? (y/n)");
    char AskQ2 = 'N'; //checks if user asked a question
    if (Questions2 != 'y' && Questions2 != 'Y' && Questions2 != 'N' && Questions2 != 'n') //if user input is not valid
    {System.out.println("Reyes: Um.. I couldn't understand you so guess that means you already know!");}
    
    while (Questions2 == 'y' || Questions2 == 'Y')
    {
      char Questions2p2 = IBIO.inputChar("What's the plan (P)/Shimada? (S)/ What is the mission? (M)/ Quit (N)"); //things user can ask
      if (Questions2p2 == 'P'|| Questions2p2 =='p') //prints out answer
      {AskQ2 = 'Y'; //will be set, so it means that the user asked a question, is in each branch of questions
        System.out.println("Reyes: Well, to be honest with you I have no clue.");
        System.out.println("McCree: ...");
        System.out.println("Reyes: Well I’m sure we will find something eventually ;)");
        System.out.println("");
      }
      else if (Questions2p2 == 'S'|| Questions2p2 =='s')//prints out answer
      {AskQ2 = 'Y';
        System.out.println("Reyes: The Shimada clan, one of the most notorious gangs currently. They are a clan of highly trained assassins and warriors.");
        
        pressAnyKeyToContinue();
        
        System.out.println("They specialize in assassination as well as weapon trafficking. You can tell if someone is a part of the Shimada clan as they have a dragon tattoo somewhere on their body.");
        
        pressAnyKeyToContinue();
        
        System.out.println("We currently don’t know who their leader is or where they reside, but that’s what we're for.");
        System.out.println("");
      }
      else if (Questions2p2 == 'M'|| Questions2p2 =='m')//prints out answer
      {AskQ2 = 'Y';
        System.out.println("Reyes: We are looking for any clues on the Shimada. Currently we know nothing and they are a big threat to us. ");
        
        pressAnyKeyToContinue();
        
        System.out.println("Anything we can find will be helpful in tracking them down and ending their crime spree.");
        System.out.println("");
        
      }
      else //exits question loop
      {Questions2 = 'n';}
    }
    if (AskQ2 == 'N')//if user did not ask any questions
    {System.out.println("Looks like I picked a real perceptive one AHAHAHHAHAHA!");}
    else //if user asked questions
    {
      System.out.println("That's all I got for you");
    }
    return;
  }
  public void Juice()
  {
    System.out.println("*Waiter walks by*");
    char WJ = IBIO.inputChar("Waiter: Would you two like some cranberry juice? (y/n)");
    if (WJ == 'Y' || WJ == 'y') //depending on user answer it prints different things
    {
      System.out.println("McCree: Yes");
      System.out.println("Reyes: I would like one too");
      System.out.println("Waiter: Here you go");
      System.out.println("");
      
    }
    else if (WJ == 'N' || WJ =='n')
    {
      System.out.println("Reyes: I would like one, my partner here is a bit of a mood killer");
      System.out.println("Waiter: Here you go");
      System.out.println("");
    }
    else //if user inputs invalid input
    { 
      System.out.println("Waiter: Uhhhh, I guess that's a no *looks confused* ");
      System.out.println("");
    }
    System.out.println("*McCree spots a peculiar tattoo on the waiter*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: That's quite the interesting tattoo you got there.");
    System.out.println("McCree: What is it?");
    
    pressAnyKeyToContinue();
    
    System.out.println("Waiter: *nervously* it's a drago....n fly!, from my homeland");
    System.out.println("*Waiter hurries away*");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    System.out.println("McCree and Reyes: We better follow him!");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Looks like you will fit in just right kiddo, HAHAH!");
    
    pressAnyKeyToContinue();
    
    System.out.println("Looks like we're going to be here for a while, want to play a game?");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: What game?");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Blackjack");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Your on!");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    BlackJack(); //uses my old blackjack code, to play a game of blakcjack, calls method blackjack
    System.out.println("Reyes: That's enough gambling for today, let's get some rest...");
    return;
  }
  public void BlackJack() //method blackjack, instead of the rock paper scissors game in the design document
    
  {
    System.out.println ("****** WELCOME TO BLACKJACK! ******");
    System.out.println ("Each number card is worth that value, Kings , Queens and Jacks are worth 10, Aces are 11.");
    System.out.println ("Don't go over 21 or you will bust and lose, you can have a max of 5 cards.");
    System.out.println ("");
    char Cont = 'y'; //Restart Variable to restart the game
    
    while (Cont == 'y'|| Cont == 'Y') 
    {
      int Tot1 = 0; // when game restarts, this clears the player and dealer card values
      int DTotal = 0;
      
      int Dcard1 = (int)(Math.random()*9)+2;  //makes the dealer's card value
      int Dcard2 = (int)(Math.random()*9)+2;  //makes the dealer's second card value
      DTotal = Dcard1 + Dcard2; //finds dealer's total
      
      int Pcard1 = (int)(Math.random()*9)+2; //the 2 random card values the user gets
      int Pcard2 = (int)(Math.random()*9)+2;
      Tot1 = Pcard1 + Pcard2; //total card value of user
      
      
      if (Tot1 <21) //if the player's total is below 21 this code executes (this is the draw more cards function)
      {
        System.out.println ("You still got room for more cards! "); 
        System.out.println ("Your total: " + Tot1); //prints users total to screen
        char Res1 = IBIO.inputChar("Want another card? (y/n) "); //this determines if the user wants to risk getting 
        // another card, this is used to keep the loop of the player getting new cards going
        int numcard = 2; //number of cards user has
        while (Tot1 <22 && (Res1 =='y'||Res1 =='Y')&& numcard <6 )
          //this loop will keep running as long 
          // 1)as the user agrees to keep getting cards (enters y or Y)
          // 2)Their total card amount is smaller than 22
          // 3)their total cards is below 6
          // if any of theese are false the loop will stop
        {
          numcard = numcard + 1; //whenever the loop runs it adds 1 to the number of cards
          //this is what limits the player to a max of 5 cards
          Tot1 = Tot1 + (int)(Math.random()*9)+2; //adds a random card to the player
          System.out.println("Your total is: " + Tot1); //prints out new total
          if (Tot1 < 21) //if the player still has below 6 cards (the loop will stop if they have more than 5)
            //and has a total of below 21, it will ask to repeat the loop
          {
            Res1 = IBIO.inputChar("Want another card? (y/n) "); //asking player if they want another card
          }
          else 
          {
            Res1 ='n'; //if the total value is not equal to or above 21 it will exit the loop, by setting the variable
            //that is used to continue the loop to negative we stop the loop
          }
        }
      }
      
      
      while (DTotal < 17) //if the dealer has a total below 17 they will draw a new card
      {
        DTotal = DTotal + (int)(Math.random()*9)+2; //gets the new card value for the dealer
      }
      if (Tot1 == 21) //if the players total is equal to 21 it will print out that they win
      { 
        System.out.println("YOU GOT A BLACKJACK, YOU WIN!!!!!!"); 
        Cont = IBIO.inputChar ("Want to play again? (y/n) ");
        
      }
      
      else if ( Tot1 > 21) //this makes sure that the players total is not over 21, if it is it tells the player they lost
      {
        System.out.println("Looks like you busted :(, Thanks for the money <3");
        Cont = IBIO.inputChar ("Want to play again? (y/n) ");
        
      }
      
      else if (DTotal > 21) //this makes sure that the dealer did not go over the limit, if the dealer busts it tells the player they won
      {
        System.out.println("Looks like Reyes busted, so YOU WIN!!!!!");
        System.out.println("Your total: " + Tot1);
        System.out.println("Reyes's total: " + DTotal);
        Cont = IBIO.inputChar ("Want to play again? (y/n) ");
        
      }
      
      else if ( DTotal > Tot1 )//determines if the dealer has a higher value than the player, if true it notifies the player they lost
      {
        System.out.println("Looks like the Reyes beat you, too bad!");
        System.out.println("Your total: " + Tot1);
        System.out.println("Reyes's total: " + DTotal);
        Cont = IBIO.inputChar ("Want to play again? (y/n) ");
        
      }
      
      else if ( DTotal == Tot1 )// if both the player and the dealer have the same total, it will notify the player of this
      {
        System.out.println("Looks like both of you got the same thing :/");
        System.out.println("Both of you got: " + Tot1);
        Cont = IBIO.inputChar ("Want to play again? (y/n) ");
        
      }
      else // the only possibility left is that the player has a higher total than the dealer, so it notifies the player they won
      {
        System.out.println("Looks like you beat Reyes, so YOU WIN!");
        System.out.println("Your total: " + Tot1);
        System.out.println("Reyes's total: " + DTotal);
        Cont = IBIO.inputChar ("Want to play again? (y/n) ");
        
      }
    }
  }
  public int HealthOver( int Phealth, int Damage)//if the player takes damages or heals you call this method to do that, requires the current health and the heal/damage being done
  { 
    Phealth = Phealth + Damage; //gets the user's new health balance
    if (Phealth <=0) //this statement occours several times throughout my code, what it does is it force kicks the user out of the loop if they have blow or equal to 0 health
      // since while loops check only after the loop is done, this is the only way which I know how to make the user completely exit all loops, until it leads to the "Play again? " at the end of the main constructor 
    {return Phealth ;}
    if (Damage <0) //if damage is being dealt, this runs
    {
      int Damageshow = Damage*-1; //since I need to print out damage, I don't want to print out a negative number, so I multiply the damage by -1 to make it a positive number which can be shown
      System.out.println("");
      System.out.println("************************************************************************************************");
      System.out.println("You have lost " + Damageshow + ", you now have "+ Phealth + " health.");
      System.out.println("************************************************************************************************");
      System.out.println(""); //prints out the damage take and the user's current health
    }
    
    else //if it is a heal
    {
      System.out.println(""); //shows the heal amount and the user's current health pool
      System.out.println("************************************************************************************************");
      System.out.println("You gained " + Damage + ", you now have "+ Phealth + " health, don't be stupid with it.");
      System.out.println("************************************************************************************************");
      System.out.println("");
    }
    return Phealth;//returns the user's new health
  }
  public int Night(int Chealth) //Night part of my game
  { 
    if (Chealth <=0)//this statement occours several times throughout my code, what it does is it force kicks the user out of the loop if they have blow or equal to 0 health
      // since while loops check only after the loop is done, this is the only way which I know how to make the user completely exit all loops, until it leads to the "Play again? " at the end of the main constructor 
    {return Chealth;}
    System.out.println("");
    System.out.println("As I gaze outside the night is pitch black, barely illuminated by the streetlights");
    
    pressAnyKeyToContinue();
    Ascii(6);
    System.out.println("*ALL PASSENGERS MUST GET OFF NOW, THIS IS THE LAST STOP!*");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: We better get off and follow that guy, as of now he is our only lead.");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: You know you could have planned it better.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: God damn it, just blame Morrison.");
    System.out.println("");
    
    char Wait = IBIO.inputChar("Damn, that guy is taking his sweet time to leave, should we go now? (y/n)"); //gives the user a choice, if they want to go or not, each decision has a differnt outcome (bad = damaged)
    if (Wait == 'y'|| Wait == 'Y') // if the player decides to wait
    {
      System.out.println("You both jump out pre-emptively, and end up warning the waiter, who starts running");
      
      pressAnyKeyToContinue();
      
      System.out.println("As you pursue the waiter, he throws a grenade which directly hits you..."); 
      Chealth = HealthOver(Chealth, -30); //Player loses 30 health is this is picked
      if (Chealth <=0) //refer above to what this does
      {return Chealth;}
      
      System.out.println("Reaper Catches up to him and knocks him out, then takes his apartment key.");
      System.out.println("");    
    }
    
    else if (Wait == 'n' || Wait == 'N') //if player decides to wait
    {
      System.out.println("You wait a bit and then leave and the waiter doesn't see you following him.");
      
      pressAnyKeyToContinue();
      
      System.out.println("You stealthily follow him and knock him out and get his apartment key.");
      System.out.println("");
    }
    else //if player inputs invalid input
    {
      System.out.println("Reyes can't understand you and jumps out, you then follow him");
      
      pressAnyKeyToContinue();
      
      System.out.println("Due to your incompetence you both jump out pre-emptively, and end up warning the waiter, who starts running");
      
      pressAnyKeyToContinue();
      
      System.out.println("As you pursue the waiter, he throws a grenade which hits you...");
      Chealth = HealthOver(Chealth, -30); //loses 30 health if this happens
      if (Chealth <=0)
      {return Chealth;}
      System.out.println("Reaper Catches up to him and knocks him out, then takes his apartment key.");
      System.out.println("");   
    }
    System.out.println("Reyes: Ok, lets go quickly, and find some leads in his apartment.");
    return Chealth; 
    
  }
  
  public int Apartment(int Chealth) //apartment section of my game
  { if (Chealth <=0)
    {return Chealth;}
  
  Ascii(10);//prints out ascii
  System.out.println("We enter a small messy apartment....");
  System.out.println("McCree: Look, I found a letter.");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: Go on open it.");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: I think we got our way in, Reyes.");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: Where?");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: No clue I have to decipher it first.");
  System.out.println("Reyes: Great, why couldn't they just be more straightforward with these things. What’s the riddle?");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: With a halo of water, the tongue of wood, and stone skin, what am I?");
  System.out.println("Reyes: I was never the sharpest tool in the shed, so looks like your going to have to do it .");
  System.out.println("");
  Riddle1(); // The first riddle the player has to answer, (has to answer correct to move on)
  System.out.println("Reyes: A castle?");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: Ya");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: WHICH ONE, DO YOU KNOW HOW MANY CASTLES THERE ARE IN THIS WORLD!");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: It also says it is located at the at the belly of the beast.");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: How fitting for the Shimada clan, so close to us yet we look over it.");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: Where is it?");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: The Shimada clan once owned a Castle called Shimada Castle, it must be there.");
  System.out.println("McCree: Let's get going.");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: WAIT! I hear someone outside.");
  System.out.println("");
  Chealth = Choice2(Chealth); //The second choice the player gets to make
  if (Chealth <=0)
  {return Chealth;}
  System.out.println("Reyes: Looks like another Shimada.");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: Looks like he had a package on him, it says do not open.");
  System.out.println("Reyes: Really? Give it here *opens*");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: It's a key?");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: It's just a key. I thought it would be cooler.");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: Can I see? *gets it* OWOWOWOW");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: What? It hurts, it feels fine to me. Weird, I will keep it then.");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: Look there is a safe here, it says only a Shimada can open it safely. It says \"Rejuvenation Potion\" inside.");
  
  pressAnyKeyToContinue();
  
  System.out.println("");
  Chealth = Potion(Chealth);//player gets to decide if they want to risk trying to get a health potion
  if (Chealth <=0)
  {return Chealth;}
  System.out.println("Reyes: McCree stop fooling around let’s go, before more goons come.");
  
  pressAnyKeyToContinue();
  
  System.out.println("");
  return Chealth;
  
  }
  
  
  public void Riddle1() //first riddle the player answers
  {
    char isCorrect = 'n'; //the initialization of the stopping variable
    while (isCorrect == 'n') //will run forever, until the user gets the answer out
    {
      String guess = IBIO.inputString("Enter your guess: ");//gets the users guess to the riddle
      if (guess.equalsIgnoreCase("castle")) //if the user's answer is right, answer = castle
      {
        isCorrect = 'y';
      }
      else //if the user's answer is wrong
      {
        System.out.println("Reyes: I think you may want to think it over again...");
        System.out.println("");
      }
    }
    return; 
  }
  
  public int Choice2(int Chealth)//second choice the user can make
  {
    if (Chealth <=0)//this statement occours several times throughout my code, what it does is it force kicks the user out of the loop if they have blow or equal to 0 health
      // since while loops check only after the loop is done, this is the only way which I know how to make the user completely exit all loops, until it leads to the "Play again? " at the end of the main constructor 
    {return Chealth;}
    char Choice2 = IBIO.inputChar("Reyes: It's up to you newbie!, Fight or Hide? (F/H) ");//asks user what their choice is 
    
    if (Choice2 == 'f' || Choice2 == 'F')//if they decide to fight
    {
      System.out.println("McCree: We jump him as he opens the door...");
      System.out.println("McCree: 3"); //add delay
      try        
      {
        Thread.sleep(1000);// adds a delay to the messages being printed
      } 
      catch(InterruptedException ex) 
      {
        Thread.currentThread().interrupt();
      }
      System.out.println("McCree: 2");
      try        
      {
        Thread.sleep(1000);
      } 
      catch(InterruptedException ex) 
      {
        Thread.currentThread().interrupt();
      }
      System.out.println("1");
      
      pressAnyKeyToContinue();
      
      System.out.println("McCree and Reyes pounce on the unsuspecting intruder, and knock him out");
      System.out.println("");
      
    }
    else if (Choice2 == 'h' || Choice2 == 'H')// if user decides to hide
    {
      System.out.println("McCree: We hide, when he leaves we jump him.");
      System.out.println("*both hide*");
      
      pressAnyKeyToContinue();
      
      System.out.println("*Man enters room and sees opened letter, as well as no one in the room, and gets suspicious*");
      
      pressAnyKeyToContinue();
      
      System.out.println("*Man starts looking around and finds you!*");
      System.out.println("*you get him by one hell of a punch to the gut*");
      
      pressAnyKeyToContinue();
      
      Chealth = HealthOver(Chealth, -40); //takes 40 damage if user picks this path
      if (Chealth <=0)
      {return Chealth;}
      System.out.println("*Reaper jumps on him while he mocks you, and knocks him out*");
      System.out.println("");
      
    }
    else //if user inputs an invalid 
    {
      System.out.println("You stumble around like an indecisive idiot, the person opens the door and beats you to a pulp, until Reyes comes to help....");
      
      pressAnyKeyToContinue();
      
      Chealth = HealthOver(Chealth, -50);//user takes 50 damage if they go this route
      if (Chealth <=0)
      {return Chealth;}
    }
    return Chealth; 
  }
  
  public int Potion( int Chealth) //the user is asked if they want to try their luck with a health potion
  {
    if (Chealth <=0)
    {return Chealth;}
    char wtry = IBIO.inputChar("Should I try to open it? (y/n)"); //asks user if they want to try the potion
    int randomP = (int)(Math.random()*9 +1); //randomly chooses a number, to randomly determine if the potion works
    if (wtry == 'y' || wtry == 'Y')
    {
      if ( randomP%2 ==1) //if odd it works
      {
        System.out.println("To your surprise, the vault opens and you are presented with a liquid.");
        
        pressAnyKeyToContinue();
        
        System.out.println("Being the smart individual you are, you gulp it down with no hesitation."); 
        Chealth = HealthOver( Chealth, 50); //heals 50 health
        if (Chealth <=0)
        {return Chealth;}
        System.out.println("");
      }
      else if (randomP%2 == 0)//if even it fails and damages the user
      {System.out.println("The vault electrocutes and cripples you."); 
        
        pressAnyKeyToContinue();
        
        Chealth = HealthOver( Chealth, -30);//takes 30 health if it fails
        if (Chealth <=0)
        {return Chealth;}
        System.out.println("You decide to leave it to prevent more brain damage to yourself.");
        System.out.println("");}
    }
    
    else if (wtry == 'n') //if the user does not want to try the potion
    {System.out.println("The vault looks scary and you decide to leave it be....");}
    else //if the user inputs an invalid input
    {
      System.out.println("Your sheer stupidity confuses yourself, while dazed you put your hand on the vault which then electrocutes and cripples you.");
      
      pressAnyKeyToContinue();
      
      Chealth = HealthOver( Chealth, -30); //user loses 30 health if this happens
      if (Chealth <=0)
      {return Chealth;}
      System.out.println("You decide to leave it to prevent more brain damage to yourself.");
      System.out.println("");
      
    }
    return Chealth;
  }
  
  
  
  public int Castle (int Chealth) //enters the castle
  {
    if (Chealth <=0)
    {return Chealth;}//this statement occours several times throughout my code, what it does is it force kicks the user out of the loop if they have blow or equal to 0 health
    // since while loops check only after the loop is done, this is the only way which I know how to make the user completely exit all loops, until it leads to the "Play again? " at the end of the main constructor 
    System.out.println("We enter a huge stronghold, with a huge Shimada crest banner hanging over the place...*");
    Ascii(11); //prints ascii
    System.out.println("McCree: Where to, Reyes?");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: The mouth of the dragon in the temple, that is the where an entrance would be if there was one around here it would be.");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree *to himself*: That is strange, there would be no way for him to just think of the entrance. He has been acting weird since last night. ");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Reyes inspects, the dragon painting and finds a knob and opens a hidden door*");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    Chealth = Riddle2(Chealth); // user goes through a series of riddles which they have to solver to progress
    if (Chealth <=0)
    {return Chealth;}
    System.out.println("");
    System.out.println("Shimada member: Well done, enter the dragons den. *door opens*");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Reyes jumps on the guy behind the door*");
    System.out.println("Reyes: Put the clothes on, were not getting anywhere with these clothes. Also try to hide your arm so they don't see you don't have a tattoo.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Welcome to the Shimada Castle");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    return Chealth;
  }
  public int Riddle2(int Chealth) //second riddle which the user goes through, answers = Soul, Water, Mind, Honour
  {
    if (Chealth <=0)
    {return Chealth;}
    System.out.println(" A voice on the other side, says recite the word to fill in the the Shimada creed, failure will hurt ... literally hehe");
    char ar = 'n'; //initializes all of the riddle loop stopping variables
    char br = 'n';
    char cr = 'n';
    char dr = 'n';
    while (ar == 'n')
    {
      String aguess = IBIO.inputString("The brain is in the body, the ____ is in the heart."); //gives user the riddle, if they get it right it closes the loop and moves on, repeats for each riddle
      
      if (aguess.equalsIgnoreCase("soul")) //if right it closes the loop
      {
        System.out.println("Correct...");
        ar = 'y';
      }
      else //if wrong it closes the loop
      {System.out.println("WRONG!! *you get shot with an arrow due to your incompetence.....*");
        Chealth = HealthOver( Chealth, -10); //if wrong user loses 10 health
        if (Chealth <=0)
        {return Chealth;}
      }
    }
    
    while (br == 'n')
    {
      String bguess = IBIO.inputString("Flow like ____, stand like stone.");
      
      if (bguess.equalsIgnoreCase("water"))
      {
        System.out.println("Correct...");
        br = 'y';
      }
      else
      {System.out.println("WRONG!! *you get shot with an arrow due to your incompetence.....*");
        Chealth = HealthOver( Chealth, -10);
        if (Chealth <=0)
        {return Chealth;}
      }
      
    }
    
    while (cr == 'n')
    {
      String cguess = IBIO.inputString("True power is not through weapons, but through the ____.");
      
      if (cguess.equalsIgnoreCase("mind"))
      {
        System.out.println("Correct...");
        cr = 'y';
      }
      else
      {System.out.println("WRONG!! *you get shot with an arrow due to your incompetence.....*");
        Chealth = HealthOver( Chealth, -10);
        if (Chealth <=0)
        {return Chealth;}
      }
      
    }
    
    while (dr == 'n')
    {
      String dguess = IBIO.inputString("__n__r the fallen.");
      
      if (dguess.equalsIgnoreCase("honour"))
      {
        System.out.println("Correct...");
        dr = 'y';
      }
      else
      {System.out.println("WRONG!! *you get shot with an arrow due to your incompetence.....*");
        Chealth = HealthOver( Chealth, -10);
        if (Chealth <=0)
        {return Chealth;}
      }
      
    }
    return Chealth; //exits riddle loop and returns user health
    
  }
  //dif health bar add in text
  public int InCastle(int Chealth)//in the castle part of my game
  {
    if (Chealth <=0)//this statement occours several times throughout my code, what it does is it force kicks the user out of the loop if they have blow or equal to 0 health
      // since while loops check only after the loop is done, this is the only way which I know how to make the user completely exit all loops, until it leads to the "Play again? " at the end of the main constructor 
    {return Chealth;}
    
    System.out.println("McCree: So what exactly are we looking for?");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Any books, training methods, information that would give us insight into the Shimada Clan.");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    Chealth = TOF(Chealth);//true or false task, does not have to be right to continue, is new feature 
    if (Chealth <=0)
    {return Chealth;}
    System.out.println("");
    
    pressAnyKeyToContinue();
    
    System.out.println("Shimada Member: Hey Kiryu, what are you doing, shouldn't be at the door waiting for the next Candidate of the dark procession?");
    System.out.println("*You both look at each other in confusion*");
    
    pressAnyKeyToContinue();
    
    System.out.println("Shimada Member: You look bit shook, and confused. I know you are new do you need me to explain something?");
    System.out.println("Reyes: That would be appreciated");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    Question2(); //user can ask a Shimada member, questions 
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Thank you");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Clan member walks away*");
    System.out.println("Reyes: McCree we should split up to cover more ground");
    System.out.println("*Reyes leaves in an instant leaving you alone*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Odd he didn't seem like himself, he's acting as if something's possessed him, how unusual. Better go look for anything of use.");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Loud shriek*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Shoot, someone found the guy at the door I need to take care of him as quick as possible");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    Chealth = Battle();//user enters a battle with an enemy, re-vamped old battle
    if (Chealth <=0)
    {
      return Chealth;
    }
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    System.out.println("McCree: Phew, close one. Hmmm what’s this vial he had on him?");
    
    pressAnyKeyToContinue();
    
    Chealth = Vial(Chealth);//another random chance health potion
    if (Chealth <=0)
    {return Chealth;}
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: I wonder how Reyes is doing...");
    System.out.println("");
    
    pressAnyKeyToContinue();
    
    System.out.println("*IN REYES HEAD*");
    System.out.println("Unknown Voice: The power you seek, the power you need is right in front of you. ");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Who are you?");
    
    pressAnyKeyToContinue();
    
    System.out.println("Unknown Voice: You know you want the power, people always think of you Second to Morrison, the government, other members.... Ana.");
    System.out.println("Unknown Voice: I could give you everything you want, just accept me.");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Slowly walks toward a book which exudes a dark aura*");
    System.out.println("Unknown Voice: I only let those who know the pain use the power, you understand what it feels to be unrecognized. Accept me with the key, and you will see the downfall of Morrison.");
    
    pressAnyKeyToContinue();
    
    System.out.println("*USES KEY*");
    System.out.println("Reyes: AHHHHHHHH");
    System.out.println(" *Reyes Gasps for air, and collapses to the ground*");
    System.out.println("*Reyes suddenly disappears into a cloud of smoke and re-appears*");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: I feel powerful and invigorated.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Unknown Voice: You are now one with the shadows... Reaper.");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Reyes now power crazy goes insane and starts destroying everything*");
    System.out.println("");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Back to McCree*");
    System.out.println("");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: I can't find anything, why did they have to be so secretive with their things.");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Walks down a hallway, when he hears a shriek*");
    
    pressAnyKeyToContinue();
    
    System.out.println("Hanzo: This is for the better of the clan brother!");
    
    pressAnyKeyToContinue();
    
    System.out.println("Genji: Hanz.... AHHhhHhHhHHHh");
    
    pressAnyKeyToContinue();
    
    System.out.println("Elder: Well done Hanzo, you are now the new head of the Shimada Clan, do not regret, he would have only betrayed us in the end. Truly unfortunate to waste such a specimen of talent.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Young master Hanzo you are the fleeting image of your father Sojiro, I'm sure he would be proud. As for him, I'm sure he is dead, I will ask the others to collect and dispose of him later, go rest Hanzo.");
    System.out.println("*Door Closes*");
    System.out.println("*McCree walks in*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: What a messed up clan, WAIT this Genji the heir to the throne of the Shimada Clan, and that must have been Hanzo. The story of the 2 brothers...");
    
    pressAnyKeyToContinue();
    
    System.out.println("Funny how things work out. Guess Genji could be useful in Overwatch. AHH HOW CAN A NINJA BE SO HEAVY AAAAAAAAAA.");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Ok, I think it's time to leave, where is Reyes.");
    System.out.println("*Crashes and loud sounds, along with screaming*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Never mind, I know.");
    System.out.println("*McCree runs to the location*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: He looks different, WAIT he looks like a shadow. What happened....");
    
    pressAnyKeyToContinue();
    
    System.out.println("Genji: He was chosen by the book *cough*, it picks a person which it deems worthy. Someone who knows pain and suffering. Looks like he has attained the Shimada's shadow form powers. Truly a formidable foe.");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: I'm going to have to stop him.");
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    int inBattleF = Battle3();//user enters the impossible poss battlle, a new battle which was added after the design document (same as other battles)
    if (inBattleF<0)
    {Chealth = 0;
      return Chealth;
    }
    System.out.println("Genji: You can't even hurt him with your skill as of now, you need another Shimada to use a demon spirit to counter his inner demon. Let me try....");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: WAIT WAIT WAIT, your injured!");
    System.out.println("Genji: *Scoffs* as if that brother of mine could hurt me.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Genji: Ryjin no ken wo kurae!");
    System.out.println("*Genji unsheathes his sword, as a giant green dragon appears*");
    
    pressAnyKeyToContinue();
    
    System.out.println("*He jumps into the air and it looks as if he dashed right through Reyes*");
    System.out.println("*It is as if time freezes and Reyes falls to the floor*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Remind me to never fight you...");
    
    pressAnyKeyToContinue();
    
    System.out.println("Genji: Hurry we must go before the other co....");
    System.out.println("McCree: Bit too late now.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Genji: I must hide, they can not know I escaped, AHHA that friend of yours is truly skilled he hit me even in demon form......");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: *wakes up from rampage* What happened?");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Not enough time to explain right now, just get ready to fight, I'll carry this Asian guy.");
    System.out.println("McCree: Looks like we're surrounded, outnumbered, but never outgunned *laughs*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: I need a distraction Reyes, 5 seconds you got it.");
    System.out.println("Reyes: On it.");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Reyes disappears and replaced by a thick fog, and starts causing havoc in their forces, no one can even touch him*");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree:  Looks like it's my turn..."); 
    
    pressAnyKeyToContinue();
    
    System.out.println(" IT'S HIGH NOOOOON"); 
    
    pressAnyKeyToContinue();
    
    System.out.println("*everybody drops to the ground *");
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Looks like we are all done here.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Last member: You missed ONE!!!!!");
    
    pressAnyKeyToContinue();
    
    System.out.println("*Reyes appears from out of nowhere and starts spinning creating a vortex of bullets catching the last member ");
    
    pressAnyKeyToContinue();
    
    System.out.println("Genji: *cough* Let us go quickly, ill guide you to the exit.");
    System.out.println("*The trio starts running*");
    
    pressAnyKeyToContinue();
    
    Chealth = Choice3(Chealth);//user chosses what they want to do 
    if (Chealth <=0)
    {return Chealth;}
    System.out.println("");   
    System.out.println("McCree: That was one hell of a first mission, I think I will enjoy my time as part of Blackwatch.");  
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: So who is this guy?"); 
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: The brother of the current Shimada clan leader.");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: *SPITS OUT WATER* WHAT");   
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Looks like we got to drag him back to Overwatch, maybe Dr. Zeigler can help him.");  
    
    pressAnyKeyToContinue();
    
    System.out.println("McCree: Great, after all that happened, I think we found our self a new Blackwatch member too");  
    System.out.println("Reyes: AHAHHA! Welcome to Overwatch kiddo, no going back now."); 
    
    pressAnyKeyToContinue();
    
    System.out.println("");
    System.out.println("*In Reapers Head*");   
    System.out.println("Unknown Voice: Reaper, you won't regret this choice, I will show you true power, such that the world will bend to your will."); 
    System.out.println("Morrison, Ana and that newbie will all see the power that you possess. You currently you don't fully accept me, but I'm sure that eventually, you will learn to accept me fully.");
    System.out.println("As your anger grows, our bond will get stronger as well ...");   
    
    pressAnyKeyToContinue();
    
    System.out.println(""); 
    System.out.println("TO BE CONTINUED...");
    
    
    
    return Chealth;//ends game and returns to main constructor
    
  }
  public int Choice3(int Chealth) //user's 3rd choice 
  {
    if (Chealth <=0)
    {return Chealth;}//this statement occours several times throughout my code, what it does is it force kicks the user out of the loop if they have blow or equal to 0 health
    // since while loops check only after the loop is done, this is the only way which I know how to make the user completely exit all loops, until it leads to the "Play again? " at the end of the main constructor 
    System.out.println(" *Genji leads them to a cross roads*");
    
    pressAnyKeyToContinue();
    
    System.out.println("Reyes: Your call newbie....");
    char rchoice = IBIO.inputChar("Should we jump out the window (J) or take the stairs (S) ? ");//asks user what they want to do
    if (rchoice == 'j' || rchoice == 'J') //if they jump
    {System.out.println("*You jump out the window, and look spectacular doing it*");    }
    else if (rchoice == 's' || rchoice == 'S')//if they take the stairs
    {System.out.println("*You take the stair, while being assaulted with spears and rock*");   
      Chealth = HealthOver( Chealth, -30); //losses 30 health if this is choosen
      if (Chealth <=0)
      {return Chealth;}
    }
    else //if user inputs an invalid input
    {System.out.println("MCCREE THIS IS NO TIME TO EXUDE STUPDITY"); 
      System.out.println("You all decide to take the stairs as it is the safest option, but end up being shot by arrows"); 
      Chealth = HealthOver( Chealth, -30); //losses 30 health 
      if (Chealth <=0)
      {return Chealth;}//returns users new health
    }
    return Chealth;
  }
  
  public int Vial(int Chealth) //the second random health potion
  { if (Chealth <=0)
    {return Chealth;}
  int randomV = (int)(Math.random()*9 +1); //randomly generates a number 1-10
  char Drink = IBIO.inputChar("Drink the weird liquid in the vial (y/n)? ");// asks user if they want to try the potion
  if (Drink == 'y' || Drink == 'Y') // if they want to try
  {
    if (randomV<4)// if the random value is smaller than 4
    {
      System.out.println("You drink the liquid in the vial and you feel powerful and re-vitalized...");
      Chealth = HealthOver( Chealth, 75);//if the potion succeeds the user gets 75
      if (Chealth <=0)
      {return Chealth;}
    } ////////////////////////////////////////////
    else //if potion does not work
    {
      System.out.println("You drink the liquid in the vial and you feel a sharp pain in your stomach......");
      Chealth = HealthOver( Chealth, -35); //player loses 35 health if not successful
      if (Chealth <=0)
      {return Chealth;}
    }
  }
  return Chealth;//returns new health total of player
  }
  public void Question2() //the set of questions which the player can ask the Shimada member
  {
    char conQ = 'y';// stop asking questions stopping variable
    while (conQ == 'y')//will keep asking skins as longas this varible is y
    { //
      char wQues = IBIO.inputChar("What would you like to know about? Dark Procession(D) / Leader of the clan (L) / Shimada Legend (S) / Power of the Shimada (P) / Quit (n)"); // asks the user what they want to ask
      if (wQues == 'D' || wQues == 'd') //prints out the answer
      {
        
        System.out.println("Our previous clan leader just recently died, and his son wants to take the throne.");
        
        pressAnyKeyToContinue();
        
        System.out.println("However, he is too young and immature as of now and we need someone to take care of him and teach him the ways of the Shimada.");
        
        pressAnyKeyToContinue();
        
        System.out.println("The person who can use the Shimada shadow form is a person of pain and anguish, someone who knows the cruelty of the world. ");
        System.out.println("This person will be fit to show the young master the world and how it works, in order to prove yourself contestant must try be excepted by the dark form grimoire.");
        
        pressAnyKeyToContinue();
        Ascii(7);//prints ascii
        
        System.out.println("");
      }
      else if (wQues == 'L' || wQues == 'l')//prints answer
      {
        Ascii(8);//prins ascii
        System.out.println("About 1 month ago Sojiro Shimada died, leaving his 2 kids Hanzo and Genji to take his place. ");
        
        pressAnyKeyToContinue();
        
        System.out.println("That Hanzo, strong and serious, but Genji, I think he does not care about his fathers legacy. ");
        
        pressAnyKeyToContinue();
        
        System.out.println("Either way those 2 will be the future of this clan for the better or the worse.");
        
        pressAnyKeyToContinue();
        
        System.out.println("");
      }
      else if (wQues == 'S' || wQues == 's')//prints answer, I couldn't find any good ascii art for it, so it has none
      {
        System.out.println("Ah, the old legends. Once there were 2 dragon who ruled the land in harmony, however love turned to quarrel as they fought for power over the land. ");
        
        pressAnyKeyToContinue();
        
        System.out.println("After years of devastating fighting to the world below them, 1 of them fell. ");
        
        pressAnyKeyToContinue();
        
        System.out.println("The other dragon’s pride soon turned to sorrow as he realised that power was not important.");
        
        pressAnyKeyToContinue();
        
        System.out.println("He realised what he had done, which was ruin all that they had. One day a mysterious man appeared before the dragon and asked, “Why do you weep great dragon”. ");
        
        pressAnyKeyToContinue();
        
        System.out.println("The dragon responded, “In a fight for power I killed my brother, and now I am left in solitude”. The stranger said that in order to heal he must walk on Earth and fix what he had done.");   
        
        pressAnyKeyToContinue();
        
        System.out.println("After this the man revealed himself as his brother, with joy in their hearts they both set out to fix the damage that they have caused to the world.");
        
        pressAnyKeyToContinue();
        
        System.out.println("Truly a remarkable story, reminds me a bit about those 2 sons Hanzo and Genji……..");
        
        pressAnyKeyToContinue();
        
        System.out.println("");
      }
      else if (wQues == 'P' || wQues == 'p')//prints answer
      {
        Ascii(9); //prints ascii
        System.out.println("The Shimada’s have a very unique ability… the ability to utilize demons. Although only the higher ups are able to manifest these beasts. ");
        
        pressAnyKeyToContinue();
        
        System.out.println("I have no clue as to how they learn these techniques but, I would sure like to learn.");
        
        pressAnyKeyToContinue();
        
        System.out.println("The Shimada also have several grimoires which contain power, but be careful obtaining one is hard, but controlling it is even harder.");
        
        pressAnyKeyToContinue();
        
        System.out.println("");
        
      }
      else if (wQues == 'N' || wQues == 'n') //if user does not want to ask anymore questions
      {conQ = 'n';} //sets the loop stopping variable to false, which stops the question loop
      else //if the user inputs an invalid input
      {System.out.println("Sorry, what did you say?");}
    }
    return;
  }
  public int TOF(int Chealth)//the true of false method (answers: f, f, t)
  {if (Chealth <=0)
    {return Chealth;}
  System.out.println("McCree: Hey Reyes, are you ok you seem a bit off since this morning.");
  
  pressAnyKeyToContinue();
  
  System.out.println("Reyes: I'm fine just a bit sleepy, but I want to quiz you on something, just to make sure you are awake and ready to go.");
  
  pressAnyKeyToContinue();
  
  System.out.println("McCree: Come at me!");
  char a1 ='n';
  char b1 ='n';
  char c1 ='n';
  while (a1 == 'n') // the same process is repeated for each question
  {
    char tof1 = IBIO.inputChar("I drank mango juice on the train. True(t) or False(f)");// asks the user the true or false question
    if (tof1 == 'f') //if the user inputs the right answer it continues
    {
      System.out.println("Correct, looks like you payed attention, a trademark of a great agent!");
      a1 = 'y';//closes the first questions while loop
    }
    else// if user gets it wrong
    {
      System.out.println("Reyes slaps you across the face due to your incompetence, and in effort to wake you up");
      Chealth = HealthOver( Chealth, -10); //losses 10 health if wrong
      if (Chealth <=0)
      {return Chealth;}
      a1 = 'y';//closses the loop first question loop
    }
  }
  while (b1 == 'n')
  {
    
    char tof2 = IBIO.inputChar("I found a compass in the mysterious package. True(t) or False(f)");
    if (tof2 == 'f')
    {
      System.out.println("Correct, looks like you payed attention, a trademark of a great agent!");
      b1 = 'y';
    }
    else
    {
      System.out.println("Reyes slaps you across the face due to your incompetence, and in effort to wake you up");
      Chealth = HealthOver( Chealth, -10);
      if (Chealth <=0)
      {return Chealth;}
      b1 = 'y';
    }
  }
  while (c1== 'n')
  {
    char tof1 = IBIO.inputChar("Me and Morrison are the founders of Overwatch. True(t) or False(f)");
    if (tof1 == 't')
    {
      System.out.println("Correct, looks like you payed attention, a trademark of a great agent!");
      c1 = 'y';
    }
    else
    { 
      System.out.println("Reyes slaps you across the face due to your incompetence, and in effort to wake you up");
      Chealth = HealthOver( Chealth, -10);
      if (Chealth <=0)
      {return Chealth;}
      c1 = 'y';
    }
  }
  System.out.println("Reyes: Now that's done, we better get moving....");
  System.out.println("");
  return Chealth;//returns new player health
  }
  
  
  
  
  //Revamped old battle method
  public int Battle() //this method is repeated 3 times, each time the enemies have different moves, I couldn't have a method which changed the indivudual moves so I made 3 different methods
  {
    int Phealth = 100;//base stats for boss and player
    int BossH = 200;
    int SDamage = 20;//base damage stats 
    int FDamage = 25;
    int PDamage = 25;
    
    
    
    while (Phealth >0 && BossH >0)//will keep running as well as the player and the boss have above 0 health
    {
      for (int i = 6; i>=0; i--)//in this case I use the for loops to keep track of the number of bullets the player has, not really for making the code run a set amount of times
      {
        if (BossH > 0 && Phealth > 0) //if the both the boss and the players health are above 0 
        {
          if (i > 0)//if user has more than 0 bullets
          {
            System.out.println("");
            System.out.println("It's your turn, you have " + i + " bullets.");//tells you howmany bullets you have
            char move = IBIO.inputChar("Your turn: Shoot(S) / Fan the hammer(H)/ Flashbang (F)/ Punch(P)/ Information (I)");// asks user about what move they want to use
            int Phit = (int)(Math.random()*9 +1);//randomly generates a number incase the user wants to use a random success rate ability
            if (move == 's'||move == 'S') //if the user shots
            {
              BossH = BossH - SDamage;//subtracts your damage from the boos's health
              System.out.println("Boss Health: " + BossH + "."); ///displays the boss's health
              SDamage = 20; // there are critically improved versions of each ability (due to flashbang), so to make sure it only buffs 1 ability it resets the abilities damage
              Phealth = BossTurn(Phealth);// does the bosses move
              if (Phealth <=0)
              {return Phealth ;}
            }
            else if (move == 'h' || move == 'H')//if the user wants to fan the hammer
            {
              if ( Phit < 2)//if the random number generated is smaller than 2 it succeeds
              {
                System.out.println("You quickly shoot all of your bullets, AND THEY HIT! (You have no more bullets)");
                BossH = BossH - i*FDamage; //takes the amount of bullets and multiplies it by the damage, and subtracts it from the boss's health
                System.out.println("Boss Health: " + BossH + ".");//displays the boss's health
                i = 1; // sets i to 1 to keep the loop going (as it currently 0, and that will close the loop)
                FDamage = 25;
                Phealth = BossTurn(Phealth);//boss's turn
                if (Phealth <=0)
                {return Phealth ;}
              }
              else// if the ability does not work
              {
                System.out.println("You quickly shoot all of the bullest in your clip, too bad they all missed :( ");
                i = 1;; // sets i to 1 to keep the loop going (as it currently 0, and that will close the loop)
                System.out.println("Boss Health: " + BossH + ".");
                FDamage = 25;//resets the base damage if flash bang previously hit
                Phealth = BossTurn(Phealth);//boss turn
                if (Phealth <=0)
                {return Phealth ;}
              }
            }
            else if (move == 'f' || move == 'F')//if user wants to flash bang
            {
              if (i <=3)// if the random number generates a number less than or equal to 3
              {
                System.out.println("IT HIT!, your next move will crit doing extra damage if it hits! ");
                FDamage = 35; //sets the bonus damages for the other abilities
                SDamage = 50;
                PDamage = 75;
                System.out.println("Boss Health: " + BossH + "."); //displays the boss health
                Phealth = BossTurn(Phealth); //boss turn
                if (Phealth <=0)
                {return Phealth ;}
                i++; //incriments i to compensate for i-- in the loop, this is needed as i is the number of bullets you have, and a flashbang is not a bullet
              }
              else //if flash bang misses
              {
                System.out.println("You missed....");
                System.out.println("Boss Health: " + BossH + ".");
                Phealth = BossTurn(Phealth); //boss turn
                if (Phealth <=0)
                {return Phealth ;}
                i++; //incriments i to compensate for i-- in the loop, this is needed as i is the number of bullets you have, and a flashbang is not a bullet
              }
              
            }
            else if (move == 'p' || move == 'P') //if user wants to punch
            {
              if (Phit <= 4)//if the random number is smaller than or equal to 4
              {
                i++;//incriments i to compensate for i-- in the loop, this is needed as i is the number of bullets you have, and a flashbang is not a bullet
                BossH = BossH - PDamage; //calculates boss's new health
                System.out.println("You right hooked him right in the face!");
                System.out.println("Boss Health: " + BossH + ".");//shows boss's new health
                PDamage = 25;//resets the base damage if flash bang previously hit
                Phealth = BossTurn(Phealth);//boss health
                if (Phealth <=0)
                {return Phealth ;}
              }
              else //if punch misses
              {
                i++; //incriments i to compensate for i-- in the loop, this is needed as i is the number of bullets you have, and a flashbang is not a bullet
                System.out.println("Looks like you swung and missed....");
                System.out.println("Boss Health: " + BossH + ".");
                PDamage = 25; //resets the base damage if flash bang previously hit
                Phealth = BossTurn(Phealth);//boss turn
                if (Phealth <=0)
                {return Phealth ;}
              }
              
            }
            else if (move == 'i' || move == 'I') //displays the rules of the battle
            {
              BattleRules();
            }
            else //if user inputs an invalid input
            { 
              System.out.println("That's not an option........");
              i++;
            }
            
            
          }
          else //if the user has no bullets it will skip their turn and the boss will go again
          {
            System.out.println("You ran out of bullets, you need to reload and waste your turn.");
            Phealth = BossTurn(Phealth); //boss turn
            if (Phealth <=0)
            {return Phealth ;}
            i = 7;//reset the bullet count (it is 7 as it will de-incriment when the loop finishes)
          }
          
        }
        else
        {i = - 1;} //if the boss or the player has less than or 0 health it will close the for loop (Set i to -1)
      }
    }
    if (Phealth <= 0) // if the player has less than or equal to 0 health it will do the following
    {System.out.println("Well, looks like you perished.....");}
    else //if boss health is smaller than or 0, it will do the following
    {System.out.println("Congrats! You won!");}
    return Phealth;
  }
  
  public int BossTurn(int Phealth) //boss's turn method
  {
    int AttackMove = (int)(Math.random()*3 + 1); //the boss has 4 moves, this random number generator picks the boss's move
    int Pdamage; //the variable which holds the damage to the player
    System.out.println("");
    System.out.println("Enemy Turn: ");
    if (AttackMove == 1) //if the generator gets the 1, this is repeated for each move (3 others)
    {
      System.out.println("The enemy uses their sword to conjure several tornados!");
      System.out.println("");
      Pdamage = DescPR(1);//will find if the player takes damage, the number specifies which boss ability was selected
      Phealth = PlayerGDmg(Phealth, Pdamage); // does the damage to the player
      if (Phealth <=0)
      {return Phealth ;}
    }
    else if (AttackMove == 2)
    {
      System.out.println("The enemy dashes straight at you, sword drawn coming right at you!");
      System.out.println("");
      Pdamage = DescPR(2);
      Phealth = PlayerGDmg(Phealth, Pdamage);
      if (Phealth <=0)
      {return Phealth ;}
    }
    else if (AttackMove == 3)
    {
      System.out.println("The enemy draws his gun, and starts shooting at you!");
      System.out.println("");
      Pdamage = DescPR(3);
      Phealth = PlayerGDmg(Phealth, Pdamage);
      if (Phealth <=0)
      {return Phealth ;}
    }
    else 
    {
      System.out.println("The enemy summons a tornado and shoots into it, causing bullets to rain down!");
      System.out.println("");
      Pdamage = DescPR(4);
      Phealth = PlayerGDmg(Phealth, Pdamage);
      if (Phealth <=0)
      {return Phealth ;}
    }
    return Phealth;
  }
  public int PlayerGDmg(int Phealth, int Pdamage)//takes the player's health and the damage being dealt to the player and find the players new health
  {
    Phealth = Phealth - Pdamage; //calculates new players health
    if (Pdamage >0) //if the player is being damaged
    {
      System.out.println("");
      System.out.println("You take " + Pdamage + " you know now have " + Phealth + " health."); //displays the damage which the player is taking, and their new health pool
      
    }
    return Phealth;
    
  }
  public int DescPR(int Attacktype) //Gets the user's reaction to the boss's move
  {
    int damage;
    if (Attacktype == 1)// takes the number and determines which ability the boss is using, each ability has a different way to avoid damage, is repeated for each move
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) "); // asks the user what they want to do
      if (choice == 'h'||choice == 'H')// if they hide they don't take damage
      { 
        System.out.println("You decide to hide, the tornados can't destroy your cover and they disapate!");
        damage = 0;
      }
      else if (choice == 'r'||choice == 'R') //if they try to dodge they take damage
      { 
        System.out.println("You choose to roll, too bad you get caught up in the tailwind of the tornados...");
        damage = 10;         //sets the damage variable to 10 ( user takes 10 damage)
      }
      else //if player inputs an invalid input
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    else if (Attacktype == 2)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'r'||choice == 'R')
      {
        System.out.println("You decide to roll, and the enemy runs into a wall!");
        damage = 0;
      }
      else if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You choose to hide, too bad the enemy shattered your cover and hit you....");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    else if (Attacktype == 3)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You decide to roll, and dodge the enemy's bullets!");
        damage = 0;
      }
      else if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You choose to hide, too bad the enemy's bullets penetrate your cover and you get hit...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    else
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You decide to hide, and the bullets rain down but your cover saves you!");
        damage = 0;
      }
      else if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You choose to roll, too bad you get caught up in the bullet storm...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    return damage;//returns the damage to the player
  }
  public int Battle1() //is the same as the method above, however the enemy's moves are different
  {
    int Phealth = 100;
    int BossH = 200;
    int SDamage = 20;
    int FDamage = 25;
    int PDamage = 25;
    while (Phealth >0 && BossH >0)
    {
      for (int i = 6; i>=0; i--)
      {
        if (BossH > 0 && Phealth > 0)
        {
          if (i > 0)
          {
            System.out.println("");
            System.out.println("It's your turn, you have " + i + " bullets.");
            char move = IBIO.inputChar("Your turn: Shoot(S) / Fan the hammer(H)/ Flashbang (F)/ Punch(P)/ Information (I)");
            int Phit = (int)(Math.random()*9 +1);
            if (move == 's'||move == 'S')
            {
              BossH = BossH - SDamage;
              System.out.println("Boss Health: " + BossH + ".");
              SDamage = 20;
              Phealth = BossTurn1(Phealth);
              if (Phealth <=0)
              {return Phealth ;}
            }
            else if (move == 'h' || move == 'H')
            {
              if ( Phit < 2)
              {
                System.out.println("You quickly shoot all of your bullets, AND THEY HIT! (You have no more bullets)");
                BossH = BossH - i*FDamage;
                System.out.println("Boss Health: " + BossH + ".");
                i = 1; //subject to break
                FDamage = 25;
                Phealth = BossTurn1(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
              else
              {
                System.out.println("You quickly shoot all of the bullest in your clip, too bad they all missed :( ");
                i = 1;
                System.out.println("Boss Health: " + BossH + ".");
                FDamage = 25;
                Phealth = BossTurn1(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
            }
            else if (move == 'f' || move == 'F')
            {
              if (i <=3)
              {
                System.out.println("IT HIT!, your next move will crit doing extra damage if it hits! ");
                FDamage = 35;
                SDamage = 50;
                PDamage = 75;
                System.out.println("Boss Health: " + BossH + ".");
                Phealth = BossTurn1(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
                i++;
              }
              else
              {
                System.out.println("You missed....");
                System.out.println("Boss Health: " + BossH + ".");
                Phealth = BossTurn1(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
                i++;
              }
              
            }
            else if (move == 'p' || move == 'P')
            {
              if (Phit <= 4)
              {
                i++;
                BossH = BossH - PDamage;
                System.out.println("You right hooked him right in the face!");
                System.out.println("Boss Health: " + BossH + ".");
                PDamage = 25;
                Phealth = BossTurn1(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
              else
              {
                i++;
                System.out.println("Looks like you swung and missed....");
                System.out.println("Boss Health: " + BossH + ".");
                PDamage = 25;
                Phealth = BossTurn1(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
              
            }
            else if (move == 'i' || move == 'I')
            {
              BattleRules();
            }
            else 
            { 
              System.out.println("That's not an option........");
              i++;
            }
            
            
          }
          else 
          {
            System.out.println("You ran out of bullets, you need to reload and waste your turn.");
            Phealth = BossTurn1(Phealth);
            if (Phealth <=0)
            {return Phealth ;}
            i = 7;
          }
          
        }
        else
        {i = - 1;}
      }
    }
    if (BossH <=0)
    {System.out.println("Congrats! You won! ");}
    else
    {System.out.println("Well, looks like you perished.....");}
    return Phealth;
  }
  
  public int BossTurn1(int Phealth)
  {if (Phealth <=0)
    {return Phealth ;}
  int AttackMove = (int)(Math.random()*7 + 1);
  int Pdamage;
  System.out.println("");
  System.out.println("Enemy Turn: ");
  if (AttackMove == 1)
  {
    System.out.println("Morrison activates his attack visor and starts to shoot at you!");
    System.out.println("");
    Pdamage = DescPR1(1);
    Phealth = PlayerGDmg1(Phealth, Pdamage);
    if (Phealth <=0)
    {return Phealth ;}
  }
  else if (AttackMove == 2)
  {
    System.out.println("Morrison launches a barrage of missels at you!");
    System.out.println("");
    Pdamage = DescPR1(2);
    Phealth = PlayerGDmg1(Phealth, Pdamage);
    if (Phealth <=0)
    {return Phealth ;}
  }
  else if (AttackMove == 3)
  {
    System.out.println("Morrison starts spirinting around the areana shooting at you to fast to percieve!");
    System.out.println("");
    Pdamage = DescPR1(3);
    Phealth = PlayerGDmg1(Phealth, Pdamage);
    if (Phealth <=0)
    {return Phealth ;}
  }
  else 
  {
    System.out.println("Morrison shoot his rockets upward causing a tree to start to collapse ontop of you!");
    System.out.println("");
    Pdamage = DescPR1(4);
    Phealth = PlayerGDmg1(Phealth, Pdamage);
    if (Phealth <=0)
    {return Phealth ;}
  }
  return Phealth;
  }
  public int PlayerGDmg1(int Phealth, int Pdamage)
  {
    Phealth = Phealth - Pdamage;
    if (Phealth <=0)
    {return Phealth ;}
    if (Pdamage >0)
    {
      System.out.println("");
      System.out.println("You take " + Pdamage + " you know now have " + Phealth + " health.");
      
    }
    return Phealth;
    
  }
  public int DescPR1(int Attacktype) ///////////////
  {
    int damage;
    if (Attacktype == 1)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You decide to hide, and the attack visor can't locate and shoot at you!");
        damage = 0;
      }
      else if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You choose to roll, but the attack visor locks onto you and you get hit...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still, as well as get hit...");
        damage = 10;
      }
    }
    else if (Attacktype == 2)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'r'||choice == 'R')
      {
        System.out.println("You decide to roll, and you barely dodge the barrage of missels!");
        damage = 0;
      }
      else if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You choose to hide, too bad the missels completly destroy your cover and you get caught up in the after shock of the explosion...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    else if (Attacktype == 3)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You decide to hide, no matter how fast he sprints he can't destroy your cover!");
        damage = 0;
      }
      else if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You choose to roll, you try to dodge Morrison's attacks, but he is too fast for you and you get hit...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    else
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You decide to roll, you roll out of the way of the falling tree!");
        damage = 0;
      }
      else if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You choose to hide, too bad the tree crushes your cover and Morrison gets a shot on you...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    return damage;
  }
  
  public int Battle3()// same as the first battle but with different moves, and the boss has 9999 health (unkillable), as well as the player only gets 3 moves before the loop closes
  {
    int Phealth = 100;
    int BossH = 9999; //unkillable boss
    int SDamage = 20;
    int FDamage = 25;
    int PDamage = 25;
    int numTimes = 1;
    while(BossH >0 && Phealth>0)
    {
      
      for (int i = 6; i>=0; i--)
      {
        if (numTimes <4) //will run 3 times
        {
          if (i > 0)
          {
            numTimes = numTimes + 1;// incriments the variable that will stop the repeated if statement
            System.out.println("");
            System.out.println("It's your turn, you have " + i + " bullets.");
            char move = IBIO.inputChar("Your turn: Shoot(S) / Fan the hammer(H)/ Flashbang (F)/ Punch(P)/ Information (I)");
            int Phit = (int)(Math.random()*9 +1);
            if (move == 's'||move == 'S')
            {
              BossH = BossH - SDamage;
              System.out.println("You hit Reyes, but he doesn't seem to notice it...");
              System.out.println("Boss Health: " + BossH + ".");
              SDamage = 20;
              Phealth = BossTurn2(Phealth);
              if (Phealth <=0)
              {return Phealth ;}
            }
            else if (move == 'h' || move == 'H')
            {
              if ( Phit < 2)
              {
                System.out.println("You quickly shoot all of your bullets, AND THEY HIT! (You have no more bullets)");
                System.out.println("You hit Reyes, but he scoffs at your damage...");
                BossH = BossH - i*FDamage;
                System.out.println("Boss Health: " + BossH + ".");
                i = 1; 
                FDamage = 25;
                Phealth = BossTurn2(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
              else
              {
                System.out.println("You quickly shoot all of the bullest in your clip, too bad they all missed :( ");
                i = 1;
                System.out.println("Boss Health: " + BossH + ".");
                FDamage = 25;
                Phealth = BossTurn2(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
            }
            else if (move == 'f' || move == 'F')
            {
              if (i <=3)
              {
                System.out.println("IT HIT!, your next move will crit doing extra damage if it hits! ");
                System.out.println("You hit Reyes, but he doesn't seem to care...");
                FDamage = 35;
                SDamage = 50;
                PDamage = 75;
                System.out.println("Boss Health: " + BossH + ".");
                Phealth = BossTurn2(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
                i++;
              }
              else
              {
                System.out.println("You missed....");
                System.out.println("Boss Health: " + BossH + ".");
                Phealth = BossTurn2(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
                i++;
              }
              
            }
            else if (move == 'p' || move == 'P')
            {
              if (Phit <= 4)
              {
                i++;
                BossH = BossH - PDamage;
                System.out.println("You right hooked him right in the face!");
                System.out.println("You hit Reyes, but he doesn't seem to be affected by your punch...");
                System.out.println("Boss Health: " + BossH + ".");
                PDamage = 25;
                Phealth = BossTurn2(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
              else
              {
                i++;
                System.out.println("Looks like you swung and missed....");
                System.out.println("Boss Health: " + BossH + ".");
                PDamage = 25;
                Phealth = BossTurn2(Phealth);
                if (Phealth <=0)
                {return Phealth ;}
              }
              
            }
            else if (move == 'i' || move == 'I')
            {
              BattleRules();
            }
            else 
            { 
              System.out.println("That's not an option........");
              i++;
            }
          }
          //else
          //{BossH = - 1;}
          
          else 
          {
            System.out.println("You ran out of bullets, you need to reload and waste your turn.");
            Phealth = BossTurn2(Phealth);
            if (Phealth <=0)
            {return Phealth ;}
            i = 7;
          }
          
        }
        
      }
    }
    if (Phealth <=0)
    {System.out.println("Well, looks like you perished.....");}
    return Phealth;
  }
  
  public int BossTurn2(int Phealth)
  {
    if (Phealth <=0)
    {return Phealth ;}
    int AttackMove = (int)(Math.random()*7 + 1);
    int Pdamage;
    System.out.println("");
    System.out.println("Enemy Turn: ");
    if (AttackMove == 1)
    {
      System.out.println("Reyes suddently apears behind you...");
      System.out.println("");
      Pdamage = DescPR2(1);
      Phealth = PlayerGDmg2(Phealth, Pdamage);
      if (Phealth <=0)
      {return Phealth ;}
    }
    else if (AttackMove == 2)
    {
      System.out.println("Reyes using his dual shotguns starts shooting at you...");
      System.out.println("");
      Pdamage = DescPR2(2);
      Phealth = PlayerGDmg2(Phealth, Pdamage);
      if (Phealth <=0)
      {return Phealth ;}
    }
    else if (AttackMove == 3)
    {
      System.out.println("Reyes starts spinning creating a vortex of bullets....");
      System.out.println("");
      Pdamage = DescPR2(3);
      Phealth = PlayerGDmg2(Phealth, Pdamage);
      if (Phealth <=0)
      {return Phealth ;}
    }
    else 
    {
      System.out.println("Reyes disapears and re-apears on a vantage point, he then starts shooting at you...");
      System.out.println("");
      Pdamage = DescPR2(4);
      Phealth = PlayerGDmg2(Phealth, Pdamage);
      if (Phealth <=0)
      {return Phealth ;}
    }
    return Phealth;
  }
  public int PlayerGDmg2(int Phealth, int Pdamage)
  {
    Phealth = Phealth - Pdamage;
    if (Phealth <=0)
    {return Phealth ;}
    if (Pdamage >0)
    {
      System.out.println("");
      System.out.println("You take " + Pdamage + " you know now have " + Phealth + " health.");
      
    }
    return Phealth;
    
  }
  public int DescPR2(int Attacktype) ///////////////
  {
    int damage;
    if (Attacktype == 1)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You decide to hide, it appears as if Reyes has a relay after he re-appears you use this time to hide!");
        damage = 0;
      }
      else if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You choose to roll, but since Reyes is so close he nails you...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still, as well as get hit...");
        damage = 10;
      }
    }
    else if (Attacktype == 2)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'r'||choice == 'R')
      {
        System.out.println("You decide to roll, and Reyes can't hit you due to your movements!");
        damage = 0;
      }
      else if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You choose to hide, Reyes destroys your cover with his guns and hits you...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    else if (Attacktype == 3)
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You decide to hide, Reyes vortex gets blocked by your cover!");
        damage = 0;
      }
      else if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You choose to roll, but you end up getting caught in the vortex...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    else
    {
      char choice = IBIO.inputChar("What do you do? Roll/Dodge (R) / Hide (H) ");
      if (choice == 'r'||choice == 'R')
      { 
        System.out.println("You decide to roll, you roll and confuse Reyes, who can't hit you!");
        damage = 0;
      }
      else if (choice == 'h'||choice == 'H')
      { 
        System.out.println("You choose to hide, too bad Reyes has a vantage point and hits you...");
        damage = 10;         
      }
      else
      { 
        System.out.println("You confuse yourself and stand still and get hit...");
        damage = 10;
      }
    }
    return damage;
  }
  
  private void pressEnterKeyToContinue()
  { 
    System.out.print("Press enter to continue the dialogue...");
    try
    {
      System.in.read();
    }  
    catch(Exception e)
    {}  
  }
  private void pressAnyKeyToContinue()
  { 
    System.out.print(" ...");
    try
    {
      System.in.read();
    }  
    catch(Exception e)
    {}  
  }
  public void Ascii (int numAscii) //takes in the ascii art number which prints out a different ascii art, this was used for orginizational purposes
  {
    if ( numAscii == 1)
    {
      System.out.println("MMMMMMMMMMMN:++++++/++/-.-/+++o++++o-:dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN:++++o++o+/--:+o++o+o++o::dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN:++++o++o+/--/+o++o+oo+o::dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN:o+o+o++o+/--/oo+ooooooo::dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/sssoo+oo+/--/osoososssy//dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/yssssssso+--/ososysyysy//dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/sossyssyso:-+sysyyyyyss//dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/oooosossso:-+yyyyysssss//dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/osoooooso+::+yyssssssss//dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/oososooso+::+ssssysssss//dMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/++++oossoo::osyssyssoos++mMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/++++ossss+::oyyysssosoo++mMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/o+++osssso/:oyyyysososs++mMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN/++o+osssso/:oyyyyyosssso+mMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMM/+oooosssso/:syyyyysssssoomMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMM+o++++ossso//ohhyyysssssoomMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMN+oo++o++++o/:syyssssssssoomMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMM///+oo+++o+//ossssssyyssoomMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMM///////+oo+//osyyyssoooooomMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMoo+++////////ossooooooosyydMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMoosyyso+/////ooooossyhhhhydMMMMMMMMMMM");
      System.out.println("MMMMMMMMMMMMosososhhhyo+/ossyhdddhhhhdNMMMMMMMMMMM");
      System.out.println("MMMMMMNdhhhd+ooyyysooydd/ohmdhhhhmmmmmNMMMMMMMMMMM");
      System.out.println("ddmMMMmhhhddoooyyhhddhys:+yhdmmmmmdmmmNMMMMMMMMMMM");
      System.out.println("NhmMMMMNNmhd+++hhhhyhhdh-ohddmmmmmmmmmmNMMMNmmmdNM");
      System.out.println("MdMMMNmyhhdNo+oysysyyhhh`/shddmmmmmmNmNNNNdddmmmmN");
      System.out.println("Mhds+---::+ss+oysssysyhy./yhdmmNNNNNNmmNMNNNNmddNM");
      System.out.println("y+....-:-./.-/+sooosyhyy.+yhdmmmmmNNmdddNNMMMMNNhd");
      System.out.println("MMdy+-----/----:++++o+os:ooshddhyhdNmdddmmdmddmmMM");
      System.out.println("MMMMMMdy/.o+sssooooooyhhhssoshmo+oymNmddhddmMMMMMM");
      
      System.out.println("Overwatch HQ");
    }
    else if (numAscii == 2)
    {
      
      
      System.out.println("                 _-====-__-======-__-========-_____-============-__");
      System.out.println("              _(                                                 _)");
      System.out.println("           OO(                                                   )_");
      System.out.println("           0  (_                                                   _)");
      System.out.println("         o0     (_                                                _)");
      System.out.println("        o         '=-___-===-_____-========-___________-===-dwb-='");
      System.out.println("     .o                                _________");
      System.out.println("    . ______          ______________  |         |      _____");
      System.out.println("  _()_||__|| ________ |            |  |_________|   __||___||__");
      System.out.println("  (BNSF 1995| |      | |            | __Y______00_| |_         _|");
      System.out.println(" /-OO----OO\"\"=\"OO--OO\"=\"OO--------OO\"=\"OO-------OO\"=\"OO-------OO\"=P\"");
      System.out.println("#####################################################################");
      
      System.out.println("Train which McCree and Reyes are on.");
    }
    else if (numAscii == 3)
    {
      System.out.println("/#################%%###%#((((/////////**//////////************/(((###%%%##(((((((((((######(##(*/(#######((//########################*./ ");                
      System.out.println(",#######################%((((///////******///////**********/(#%##%%%%%%%%%###(((((((((#######(*/((##(//##%#//(######################(/./    ");             
      System.out.println(".######################%#((((////////*****/((////******/(###%%&%%%########((((((((((((#####/((*/###%(//*/(%///######################((,(       ");          
      System.out.println(" ######################%((((((/*//////****(((///////(##%#%%%%%#(((((((((((/////////((((###(***/#%##(%((///%(/(#######################*.(     ");            
      System.out.println("########(############%&&&%((((((((////*//((////(%%%%&&&&%%%%&&&&&&&&%%#((//////////(((###/*//(##%#(//(/*(#(//######################(/.(");                 
      System.out.println("(###################(%@&@@&&&&&%%##(/////(###&%&&&@&%&&&&&&%&,.%%(#%(////*/////////((((##////(##(%%%**///((/########################/./    ");             
      System.out.println("/##################(/*//####%%%%%%%%#((((/(####%%%%%%%%(//(##%%((((/////******/////(((((#///(((((#%%#////(//########################*./    ");             
      System.out.println(" ,##################%#((#%#(#((((((#####((//////((##/(##((#####((((////********////((((((((//(((##%###(//(//(########################(*(      ");           
      System.out.println(".##################%%#(######%&&&&%###%////////((//*//(((((/////////**********///((((((((((((((((##((/////(##########################((#      ");          
      System.out.println(" ###################%%((####(###((####/******///////****/////**/*************///((((((((((((((((/*///////(#############################((*,    ");         
      System.out.println("(##################%%%((###((#((((###/*******////////*********************////(((((((((((((((((****////#################################(#(*   ");        
      System.out.println("*###################%%%((##((((((((((/*******///////*******************//////(((((((((((((((((****///(%#(################################((#     ");      
      System.out.println(",###################%%%#((#(((((((((//******////////*****************///////(((((((((((((((((#(/////(%((((################################((.     ");     
      System.out.println(" .####################%%%((#((((((###(/*****//*//////***********/*//////////((((((((((((((((((%%%####((((((################################((/     ");     
      System.out.println("  ############################(((####(//***//////////*************//////////(((((((((((((((((#%%##((((((((((################################((     ");     
      System.out.println(" ##########################%#########///////////////***************////////(((((((((((((((((#%%((((((((((((################################(#   .,  ");   
      System.out.println(" (###########################%#####%(/***////(////(#/****************//////((((((((((((((((##%%((((/*//((((((################################,  .* ");    
      System.out.println(" /############################%###%%#(///(((##%#(((**************/////////(((((((((((((((((###(#((/***///(((%%@##(,.                          .*     ");
      System.out.println("(/#############################%##%%%&&%%%##(##((/*//////////////////////(((((((((((((((((((###(((*****///#&@@&%##(                                  ");  
      System.out.println(".,*##############################%#%%%%%%%%##(((/////////////////((//////(((((((((((((((((((###(((//****/(@@@@@&&@@             ..                 /   "); 
      System.out.println(" .##############################%&%%%%%%%##((///////*******///(#&%((///(((((((((((((((((((####((//***/(@@@@@@@@@@@%           ,((          ,           ");
      System.out.println(" *##############################%%%%%%%%%##(/////(((((##%%#(////*//////(((((((((((((((((##%%#((//***(@@@@@@@@@@@@@@(((((((((((((         .           ");  
      System.out.println(" *##############################%%%%&%%%%#####(###%%#(/////////*////(((((((((((((((((####%#(((//**/@@@@@@@@@@@@@@@@(((/////(((*                       "); 
      System.out.println(" (#############################%&%%%&%%&&%%%%##(/////////////////(((((((((((((((((###%%%(((((///@@@@@@@@@@@@@@@@@@@/****((/.  .                       ");
      System.out.println(" ,(#########################%&%%%%%%%%&%###((((##########((((((((((((((((((((####%%%#(((((//%@@@@@@@@@@@@@@@@@@@@@/    ,(                        .    ");
      System.out.println("  /######(#################&&%&%%%%%%%#&%%####%%%%%%####(((((((((((((((((######%%%%((((/((#@@@@@@@@@@@@@@@@@@@@,   .*%.                         .,    ");
      System.out.println(" ((###(##################&%%%%&&&&&@#%%%%%########((//////(((((((((((####%%%%#((((///#&@@@@@@@@@@@@@@@@@@.     ,                        ,#.  .,    ");
      System.out.println(" (//(#(################&&%%%&&@@%#(((((#%&%##((((////*///**//((((((((####%%%%#(((((///%@@@@@@@@@@@@@@@@@.    ,#                       ,#####. ...    ");
      System.out.println("/,((((/(#############&&%%&@@%((((((((((#%%#((/////***///**/((((((((###%%%%%#(((((/*(&@@@@@@@@@@@@@@@.    .*                      ,&%#######.  ..   "); 
      System.out.println(" *.,/(/((###########%%&@&(((((((((((((**%%#((/////**//////(((((((##%%%%%%#((((((//&@@@@@@@@@@@@@/.          .        .,      (@@@@#########   .    "); 
      System.out.println("   .,*/(###########@@/*(((//(((/((/***%#(((//////////(((((((#%&%%%%%%(((((((/#@@@@@@@@@@@@(                     .    .#&@@@@@@##########   .     ");
      
      System.out.println("Strike commander Morrison");
    }
    
    else if (numAscii == 4)
    {
      
      System.out.println("                     ,%&&&%%%%%&%%##((((((((//((#/(##(#(((#/********////***(((##(##&&%%%%&(#%%############&&%..                     ");                  
      System.out.println("                      .%&@@&%#########(((///((((**((%#((**///(/((((((((((((#######&%%&%%&&((%%%##########%&&...                        ");             
      System.out.println("                       .%&@@@(#########(((///((#%%&&&&%#(/////(((((((((((((((((######&&%%&%&&((#%%#########&&%,...                    ");               
      System.out.println("                          .&@@%#####%&@&((///((((%%(((###%#//////////////((/////((########%&%%&&&&((#%%#####%%%&&%...                ");                   
      System.out.println("                         .&@@##&&&&&@@%(((#(#(((%%&%/(((((((((((((((((/(///(///#########%&%%%%&&%((%%%%%%%%%%%..                    ");                
      System.out.println("                           %@@&(%&&&&&&&@@@@&&(//*///*/////,,*/(((((((///////////#%%&%#%%#####&%%%&%&(((%%%%%%/                   ");                   
      System.out.println("                           #&@&&&&&&&&@@@&@@@@@@@&@@@@@@@@@@@&&%%%###%%%&%%%%@@@&&#(#%%%###%%%&&&%%&%&&&&((/%/                   ");                    
      System.out.println("                           (&@@&&&&&&@@@@&&&@@@@%%(((((((#########((((######((#%&&&&&&&&@&%%%%%&&&&&%&%%%%%%&&%             ");                           
      System.out.println("                          .*@@&&&&&&&&@@@&&&%%%#((((((((/((((((((((((((((((((#(((#@@@&&@&&@@&&&&&@&&(, *#%@&&(               ");                          
      System.out.println("                          ./@@&&&&&&@&@@@@%((((((((((////////**//////////####(((((%@@&&@@@&@&&&&@(.                         ");                       
      System.out.println("                          .@@@@@&&&&@&&@@@@#((((((((////****//////////((#&&@&&%%%%&&%(%&%&&&&&&@@&&&@@                         ");                       
      System.out.println("                      ..(@@@@@@&&&&&&&@@@(((((((////*****//////((#&&@@@@@&%%%%%###(#&&&&&%&@@&&&@&.                          ");                    
      System.out.println("                     .&@@@@@@@&&&&&&&@@@@&@&&&%#((((/(///////(#&@@@@@&%%&@&&&&&@@@#/(%&&&&@&(%%@@&&&@&&@(                      ");                       
      System.out.println("                       .&@@@@@@&&@&&&@@@@@@@@@@@@@@@@/////(#%&&&&%#&&@@@@@@@@@@&**/(#@@@@&(%%%%&@&&&&&@&@@&/                  ");                       
      System.out.println("                        .&@@@@@@@&&&&@@@@&&&@@@@&&&&%##//////((%%&&&@@&&&%%%%&&&%/*///#&@@@(%%%%@@&&@&&@**&&@@@&                ");                     
      System.out.println("                        /@@@@@@@&%&&@@@@@@@@@@@@@@%%(/*///(((#&%&(**/(#%%&&%#(//////%&&&%%%###(%@&&@&&&@&,./#@@@@@%.           ");                     
      System.out.println("                          %@@@@@&%%%&@@@&&%((###%&&&((//**//(((/**(#%&&&&%##(///**///(&&%#%#/#/(#&@&@@&&@@@#... .(@@@@@&          ");                   
      System.out.println("                         .%@@&%%%%&&@@%%&&@@@&&&#(//(/***////*****//(%%#(/////(/*////&&%%%%#(//&&@@@@&&@&@@@#.     *@@@&@%        ");                  
      System.out.println("                          *&@&%%%%&@@@#((#%##%((###///(//**/////*////#%%%(%##%(/***//((%%(//(#/(&&&@@@&&&@@@@@@@%      *&&@@@#    ");                    
      System.out.println("                          &@&%%%%&@@@@#(((///((((////////**//////*////*%%********///(((#(//##/#%&&@@@@&&&@@@@@@@@@%      #@@@@#     ");                  
      System.out.println("                         #&@&%%%%&@@@(///*////////////***//////******//*******//(((#(%(**/(#&&@@@@&&&&@@@@@@@@@@@@#     ,&@@@&*     ");                
      System.out.println("                       .%@&&%%%%&@@@@%%#///////*/////////**///////******/******//((####%((##%&&@@@@@%&&&@@@@@@@&@@@@@@#   .%@@@@&.   ");                 
      System.out.println("                     %&@@&%%%%&@@@@&&%#((////***////((//***/////(*************/((#(###%&@@@&@@@@@&%&&&@@@@@@@@@&&&@@@@@,  ,%@@&&&. ");                  
      System.out.println("                    .%&&@&%%%%%@@@@@&&&%((///*****//(((//***(////((*****///////((##(#%#%&@@@@@@@@&&&&&@@@@@@@@@@@&&&&&@@@/  %&@@&&%   ");                
      System.out.println("                 (&&&@@&%%%%&@@@@@&&&&%#(//******/((#(((/(#%%%%/**/***////(##(((#%%&@@@@@@@@&&&&&@@@@@@@@@@@@&&&&&&&@@@&(&&@@&&(    ");              
      System.out.println("                *%&&&@&&&%%%%@@@@@@@&&&%%(((////**/*/#&&&%#&&&%%%#/**/*****/((((((#%%&@@@@@@@@&&&&&@@@@@@@@@@@@@@&&&&&&&&@@&@&@@@@&  ");                
      System.out.println("             .#%&&@&@&&%%%%%&@@&&&&@@&&&#((((((///****/((#(((#((#####%##(((((((##%&&@@@@@@&&&&@@@@@@@@@@@@@@@@@@&&&&&&&&@@@@@@@@&*    ");             
      System.out.println("             .%&&&&&@&&%%%%%&&@@@&&&&&&&&&&%#(((((##//(%&&&%%&&&%&&&%#(/**((((((((##%&@@@@@&&&@@@@@@@@@@@@@@@@@@@@@&&&&&&&&@@@@@@@@@.  ");               
      System.out.println("           .,&&&&&%@&%%%%%%&@@&&&&%&@@@@@@&&&((/(((((&&%&&&&&%#///((////((((((((##%&&@@&&&&@&&@@&@@@@%@@@&@@@@@@@@@&&&&&&&@@@@@@@@(   ");             
      
      
      
      System.out.println("Ana Amari");
    }
    else if (numAscii == 5)
    {
      System.out.println("@@@@@@@@@@@@@@@@@`   :@@#####++'++''''''''''''''''@##+'''';;;;;;;;;;;;:::;:::::::::::;,;.   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@.    @#####++'+'+''''''''';'''''''##+''';';;;;;;;;;:;:;:::::::::::::;;,;   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@:    @#####'+++''''''';'';';';;;'''##+''';;;;;;;;;;;;;:;:;:::::::::::;:+  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@+    @####++'+'+''''';';';';'''';'''##+'';;;;;;;;;;;::;:::::::::::::::;:  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@    @##+###++#'';''';'''++#+++++''''#+''';;;;;;;;;:;:::;:::::::::::::;;`  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@    @#######+#''';#;'######++++++'+''##''';;;;;;:;;:::;:::::::::::::::;;  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@    '@########';';+'######+++++';;;''+#+';;;;;;;;:::;:::;;:::::::::::,:;`  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@    ,@#+#+####'';''#####++''''';;;;;''##''';;;;;::;;:::;:;::::::::::::::,  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@`    @#+++####+';'#####+'''''''++#++;''##';;;;;;;;::::::;;::::::::::::,:;`  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@+    @##++#####';;#+##''+#######++#;;;'+##'';;;;::;:::::;;:::::::::::::,:,  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@    @#+++##+#+';;;++''+###'+#++''';;;''##+;;;;:;;::::::;;:::::::::::::,::`  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@    @#+++#+#++';;;;'''#;::.`+'''+;;;;;''##';;;;;::;::::;;;:::::::::::::,:,  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@    @#++#+++#+;;;;;''''::,,,+''+';:;;:;''##'';;:;;:::;:;;;:::::::::::::::,` `@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@    +#++#+++#';;;;;;;;''+;:'+'';;;:;:::''###';;;:::;:::;;;::;::::::::::::::  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@    :#++#+++#;;;;;;;;;;''';;;;;;::::::::''##'';:;;::;:;;;;:;:::;::::::::::,  :@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@.   .#++++++';;;:;;;:;;';;;;;;;::::::::;;''##';;;::;:::;;;:::;;:::::::::::::  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@;    #+#+'+#';;;;;::;::;';;:;::::::::::::''###';;;:::::;;;;:;:;:;:::::::::::  ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@#    ###+'++;;;:::;:::;:;;;;::::::::::::;;++##+';;::;:;:;;;::;;;:::::::::::::  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@`   +#+##;;;;;;++';;:;::::;:::::::;;;;;;;;;;;''###';;;;;''';;;;;';;;;;;;;;;;;;;  +@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@,   :##+#++++++'''';;:::;::::::::;;;;;;;;;;;;''+##'';;;;''';;;'';;;;;;;;;;;;;;''  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@;   .#++##+++'''++;;:;:::;:::::::;;;;;;;;;;;;;'++##';;;;''';;';;'';;;;;;;;;;;;';  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@#   `#+++++++''++;'+++'++'::;:::;;;;;;;;;;;;;;'+++#+';;;''''';''';;;;;;;;;;;;;;'.  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #+++#+#+'+##++++++++++':::;:;;;;;;;;;;;;;'+++##'';;'++'''''''';;';;;;;;;;''+  '@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #+++#+######+++++++++'::;:::;;;;;;;;;;;;;'++++#+';''''''''''';';;;;';;;;;'''`   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #+++########+++++++++++::;:;:;;;;;;;;;;;''++++##''''++'''''''';;;';;;;;;;'+'+    `@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #+++#######+'';;;;;+++++:;:;;;;;;;;;;;;'''+++++#+'''+''''''''';'';;;';;;;''''`     +@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #++++##+++';;;;;;;;;;++++:;;;;;;;;;;;;;''++++++##'''++''''''''';;;';;;;;;''';'       @@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #++++####'';;;;;;;;;;;++++:;;;;;;;;;;;''+++++'+##'''++'''''''';''';';';;;;++':'       +@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #++++##''#+';;''''';:;:+++';;;;;;;;;;;'+++'+'+''#+'''++''''''''';;';;;';;;'++:,;        @@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@    #++++##'''';;;;;;;;;'+;:'++';;;;;;;;;'++'+''''''##''++''''''''''';;;'';;;''+++:.;        @@@@@@@@@@@@@@@@@@@@");
      
      
    }
    else if (numAscii == 6)
    {
      
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%.   ...  .......,,.................%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%.........,,.,,,,,,,,,,,,,,**,,,............(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(. ...,,,,,*********,,,,,,,,*,****,,,,,,.,,,,...../@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&.....,,,,******,,,,,,*,,,,*,,,,,,,,,,,,,,,,,.,,,,,,....&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(....,,***,,,,,,.,**,,,.,,,,,,,,,,,,,,,,,,,,,,,,,.,,,......./@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(,..,**,,,,,,,,***,,*****,,,.,,,,,,,,,****,*,,**,.,,,,,,,......./@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(,,,****,,,.,*,**************,,,,,,.,,,,,,,*,**,***,*,.,..,...,,....(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,*,,**,,,,,*****//**********,,,,,,,,,***********,,.,,,.,.....,,,...... &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%*******,,,,,**//**************,*,***,,**************,,...,,,,,,,,,,,,,.. #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(********,,,**********************,,,*,*************//*,....,,,,,,,,*****...,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,*******,,,,******************,*,,,,,,,,****************,,,**.,,..,,******,...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/******************************,,,,,***,,,*******,********,,,****,....,*****,,..,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(*******************************,,,,,,,.,,**//*********************,,,..,*****..../@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&***/********************************,,,,,,,****,**,**,*,**********//*,,,...,,,,,,..#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,*******.,*,******,****************,,,,,*****,,,****,*//*********/***,,*,,,.,,.,,,..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#***/*/**, ,******************,***,,,,,,,*******,***,,*/*///*************,,**,,,,,,,..#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,**///******,********,*,*,*,,,,,,*****/******//***,,,,*/***************,,,**/***,*,..,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&****///*******,,*/**,.,*,,,,,,,,,,****/**,,,,*,**,,,,,,,****************,*****/***,,...&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(***////********,****,,,,,,...,,,,,*****,,,,,,,,,,...,,,,,**********..,,,,********,,,,..(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,****////*****,,,,**,,,,,,..,,,**,*///*,,,,,,,,,,.....,,,*********,.,,,,,*********,,....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,**/*///**/***,,,,****,,,,,,**,**************,,.,.,.,,.,,,.....***,,,,,,,********,......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/.,*//*********,,,,**,**,,,,,,*,*******,,,***,,,,,.,,,.,.,....,,*,*,,,,...,,******,,,....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/..,*/*/**********,*******,,,*,,,*****,,,.,,,,,,,,,.....,,....,,,,,,,,*,,,.,.,,,,*,,,....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#...,*////***************,*****,,,,,,,..,,,..,,,,,...,,,,.........,,,,**,,..,,,,,*,,,,../@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,...*//*/****//********,*****,,,,,***,,,,,,,,,,,,,,,,,,,...,.. ...,*****,.,,,,**,..,...&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*...***//*****/*****,**,,,***,,,,.*****,,.,,,,,,,,,,,,,,.,,,.......,*****,,.,,*,,..,...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,...,,*//***********,*,,********,.,***,,*,,,,,,,,,,...,,,,.,,......**,.,*,,,,,,......%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*../.,***//********************,,*,**,,,*,.,.,,...,,,,,,,.,,,,....,,.,,,.............@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,..,.,,**,*****,.********,,,***********..,..,,,,.,,,.....,,,.......,,,.,,..........@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,.....,,*,*,,,,,.**,*,/*,,,*******,***,,...,...,,,....,,,...,,...,,,....,. . ....&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,..,,,,,,*,,,,,,,***,,,*,,,.,**,*******,.,,...,,.....,.,...,..,,,,,............%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,..,.,,,,,,..,******,,*,*,,***********,..........,,,,.....,,.,,,,...,,.......&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,.....,,,,,,,*****/***,,**,,,**,,*,..................,,,,,,,..,.,.....,....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,........,,,,*******,,**,,,...,,,.....  ..........,........,.............@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%.....,,....,.,,*,,,,**,**,............................,,,.......,....&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(...,,,,,...,,,,,,,,,,,.....,..................,,..,,,............,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/....,.,,,,,,*,,.,,,,,,,..........................,...........*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/...,..,,,,..,....,,,,.....................,,....,....... /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&......*,,,,,,,,,..,,,.,,..........................  .&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,.....,,,,,,,,,,,,,,........................   &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(.......,,,,,,,,,...................    /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%....................  ...     .%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&/,              ..(&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      
      System.out.println("Picture of the night");
    }
    
    else if (numAscii == 7)
    {
      System.out.println("        dBBBBBBBBBBBBBBBBBBBBBBBBb");
      System.out.println("      BP YBBBBBBBBBBBBBBBBBBBBBBBb");
      System.out.println("     dB   YBb                 YBBBb");
      System.out.println("     dB    YBBBBBBBBBBBBBBBBBBBBBBBb");
      System.out.println("      Yb    YBBBBBBBBBBBBBBBBBBBBBBBb");
      System.out.println("       Yb    YBBBBBBBBBBBBBBBBBBBBBBBb  ");     
      System.out.println("        Yb    YBBBBBBBBBBBBBBBBBBBBBBBb");
      System.out.println("         Yb    YBBBBBBBBBBBBBBBBBBBBBBBb");      
      System.out.println("          Yb    YBBBBBBBBBBBBBBBBBBBBBBBb");
      System.out.println("           Yb   dBBBBBBBBBBBBBBBBBBBBBBBBb");
      System.out.println("            Yb dP=======================/");
      System.out.println("             YbB=======================(");
      System.out.println("              Ybb=======================");
      System.out.println("              Y888888888888888888DSI8888b");
      System.out.println("Shimada dark form grimoire");
      
      
    }
    else if (numAscii == 8)
    {                   
      System.out.println("                                                                                :+++++++++++:;:;+#`                         ;''.,`++''''';;+';;;;;;;:::;;;;;;'");                                      
      System.out.println("                                                                             `+++++++++++++++#';``                          ;'',.'++'''''';:'';;;;;;;:;;;;;;;; ");                                     
      System.out.println("                                                                            +++++++++++++++++++#::,                         ''':.:++'''''';;;'';;;;:;;;;;;;; `. ");                                    
      System.out.println("                                                                          ++++++++++++++++++++++#`.,`                       ''':.,+++''''''::++';;:;;;;;;:   `;  ");                                   
      System.out.println("                                                                         +++++++++++'+'+'+++'++++#..;,                      ''';.,+++++''''';;+';;;;;;':.`   `:: ");                                   
      System.out.println("                                                                       ;++++++''+''''''''''''+++++#,`;;                     '''',,;+++++''''::+';;;;;;::.`   `::  ");                                  
      System.out.println("                                                                      ++++''''''''''''''''''++++++++.`;:                    '';',`;++++''';;';++';;;;::,`    `::,   ");                                
      System.out.println("                                                                     +++++++++++++'++++'''''++++++++.,.:;.                  ''''.,++''''';;;;;;+;;::;:,.`    `::,    ");                               
      System.out.println("                                                                    ;#+++++++++++++++++++'+'+++++++++,,.:::                    ';'''''';;;;;;;;;;:::::..     .::,.     ");                             
      System.out.println("                                                                    +++++++++++++++++++++++''+++++++#:.....;                ;;;''''''';;;;;;:;:::,;:,,.`     .::,:       ");                           
      System.out.println("                                                               '++, ++#+###+##++++++++++++++'''++++#+;,..,.`:              `;;'''';;;;;;;;;:::.::,;,,.``     ,:,,::      ");                           
      System.out.println("                                                              '##'+++########+##++++++++++++''+++++++';,,,,.,.             ,;;''';'''::;;;::::,:,,,,..``     ,:,,:,       ");                          
      System.out.println("                                                              +###++######+';;;'#++++++#+++++++++++#+';;`..,`,.            ;;'';;'''';;,:::::,.:...:.``      ::,,:,.      ");                          
      System.out.println("                                                             +########+;;::,::::'+++++++++'+++++++++` ';:,,,.,,.          ;;;;''''''';;;:::,,,.,....```     ::::,;,       ");                         
      System.out.println("                                                              '####,##+;:::,,,:::'###+++++'+#+++++#++` :;;,.,,,`..         .;''';''''';;;;::::,,,,....``    `::::,:,      ");                          
      System.out.println("                                                              ,####+:#;:,,,,,,,:::;###++''++''++++++#`  ';:`.,,.`,,        #;;';;;;;+'';;;;;;;::,,,,...```  .::::,,,       ");                         
      System.out.println("                                                               ##### :,,,,,,,,,,::++##+''++'''+++++##   ;:,,.,,,..,.      +#+;;;;;;;'#+'';;;;;;;:::,,,...```::;::,,        ");                         
      System.out.println("                                                               ###;#`.,,,,,,,,,,,::;#+'++'':'+;:+++##    '.,,,.,,,,.,     ###;;;;;;'''#+:';:;;;;;;::::,,..``;;;;:,,         ");                        
      System.out.println("                                                               +###,#..,,,,,+;,,,:::;+'';::''::;#+++#    ,+.,,,,,,,..,`  `####';;;;'':#++':';;;;;;;;:::,,...;;;;:,`       ");                          
      System.out.println("                                                               ,#+# @`..,,,##':::,:::;+;:;'+;;;;++++#     ';.;,,,,.,,,,  +####:;;;;;';+++++':';;;;;;;;::,,,,;;;:,,       ");                           
      System.out.println("                                                                ###`  ...,#+;;;;:,,::;+;;;+'';;:''###     `'..:,,...,`,: +++##+';;;;';;;++++';';;;;;;;:::,,:;;;:,       ");                            
      System.out.println("                                                                +##+. ...#;'+#'::,,,:;'';:,:';;:;'+##      '+...,,.,,,.:;++###+:;;;;';;;;;;+':;;;;;;;;;:::,;;;:.,       ");                            
      System.out.println("                                                                 ++#; .:#;','+::,,,,:'';::'';::;;;+##       ';.,,,,,:::,++###';,;;;;';;;;;:'++:;;;;;;;;;:::';;,,        ");                            
      System.out.println("                                                                 +#+,',,;''+''::,,,:;'+;''';::;;;;''#       .'..:,,,,::;++###;:::;';';;;;;;.'++,;;;;;;;;:;:;;:.         ");                            
      System.out.println("                                                                  ++# .,:::;::::,,:;;''';:;;:;'::;'':        ++,.,,,,:;;++###:::;;';';;;;;';,+'::;;;;;;;;;;;;..          ");                           
      System.out.println("                                                                  ;+# ,,:::::,::::;;;;;;;';';':::;;;          +;,,,,:;;+++###::'';;;';;;;;';;'+',:;;;;;;;;';,.          ");                            
      System.out.println("                                                                   #+#,:::,,::::;;;;;;;;''''':::;;;;'         ,+.,:::;'+++##,,',,;;;;';;;;;;;:'++,;;;;;;;:;:.          ");                             
      System.out.println("                                                                    +#.::::,:::;;;;;;;;;'''';::;:::;;;         ++,,,:;++###;,:..,:;;;';;;;;;;',''',;;;;;;;:.           ");                             
      System.out.println("                                                                    '+,::::::::;;;;;;;;;''''::::::::;;,         +',::;++###,,,..,.;;;';;;;;;;''.+'',:;;;:;,`          ");                              
      System.out.println("                                                                     #,,,,:;;::::;;;;;;;''';:::::::::;;.        :+,,'++###:,,,...,;;;;;;;;;;'';':+'',,;;,:;           ");                              
      System.out.println("                                                                      .,,;';::::::;;;;;;''+::::::::::;;;         ++;;+####,,,,``..;;;;';''''''';;:+'+,,;;;`          ");                               
      System.out.println("                                                                      :;'+''+'::::;;;;;;++:::::::,::::;':         +':+###',,,,```.:;;:''''''';;;;;:+''+`;,         ");                                 
      System.out.println("                                                                       '+'+###+++';;;;;''#::::::,,,,::;'''        .+'####,,,,,,.;':;;:;''''';;;;;;;`'#::.:       ");                                   
      System.out.println("                                                                        +#:::;;''+'';;'+++::::,,,,,,,::;''',       +###':,,,,,,..';;:::''''';;;;;::: ,:`,.      ");                                    
      System.out.println("                                                                         '';;::::;#''++#+;::::,,,,,,,::;'''';       ##;:,,,,,,,..+;;;::;''';;;;:::,,.,..:       ");                                    
      System.out.println("                                                                          .;;;;;;;;#+++#+;;::,,,,,,,,::;;'''''      ##,,,,,,,,...;';::::'';;;;:::,,...`,.      ");                                     
      System.out.println("                                                                           '';;;;;;'+++#;;;;,,,,,,,,,,:;;''''''+##,,#;:,,,,,......';:::,,;;;::::,,.`.`.:      ");                                      
      System.out.println("                                                                            `:;;;''+####;;;:,,,,,,,,,,:;;''''''++++##:,,,,,...```#+';;:,,,:;:::,,,.,`.:;     ");                                       
      System.out.println("                                                                             ';;'''+###+;;;,,,,,,,,,,,,:;;'''''++++';:,,,,,...```#;';;;,,,,,;::,,,`.`,;;     ");                                       
      System.out.println("                                                                            .++'''+###+';;,,,,,,,,,,,,,:;;'''''+++;:',,,..,...```#:+',;;:,,,,:;:,,,`:;;.    ");                                        
      System.out.println("                                                                            .++#++++#+'::,,,,,,,,,,,,,,::;''''++++,,,,,.......`.`#+'';:;;:,,,,,;:`.;;;::    ");                                        
      System.out.println("                                                                            `#+++#:  ;',,,,,,,,,,,,,,,,::;''''+++ :.,:...........#+,+':;'';,,,..,;;;;:;::   ");                                        
      System.out.println("Genji and Hanzo Shimada.");
      
    }
    
    
    else if (numAscii == 9)
    {
      
      
      
      
      
      System.out.println("   .    @@@@@@@@@`        @@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@,     ,          @@@@@@@@@@@' @@@@@@            @@@@@@@@@  ");  
      System.out.println("   .    @@@@@@@@@        #@@@@@@@@@@@@@@@@@@@,`@@@@@@@@@@@@                 .@;@@@@@@@@@; #@@@@@`           +@@@@@@@@' ");  
      System.out.println("   .    @@@@@@@@@        @@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@                  ; '@@@@@`@@@`:,@@@@@'           .@@@@@@@@@  "); 
      System.out.println("   .   '@@@@@@@@`       '@@@@@@@@@@@@@'@@@@@@@ +@@@@@@@@@                     @@@@@@ @@;   @@@@@@            @@@@@@@@@  "); 
      System.out.println("   .   @@@@@@@@@        @@@@@@@@@@@@@@.@@@@@@@ #@@@@@@@@                      @@@@@@`@@+   @@@@@@            @@@@@@@@@  "); 
      System.out.println("   .   @@@@@@@@@        @@@@@@@@@'@@@,;@#@@@@@ @@@@@@@@'                       .`@@@,@@@   +@@@@@:           :@@@@@@@@, "); 
      System.out.println("   .   @@@@@@@@@        @@@@@@@`@ @@@ @; @@@@``@@@@@@@@                         @@@@+@@@   ,@@@@@#            @@@@@@@@; "); 
      System.out.println("   .  .@@@@@@@@         @@@@@#  @ @@    `@@@;.@@@@@@@@`                       .@@@@@@+@@`   @@@@@@ @@@,       @@@@@@@@@ "); 
      System.out.println("   .  #@@@@@@@@          +@@+  @`:@:    #@@@`@@@@@@@@@                        @@@@@@@:@@@   @@@@@@ ,#@@@+,    @@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@@          @@@@@# +@@     @;@@:@@@@@@@@                         @@@@@@@`@@@   @@@@@@ +@@@@@@@@  @@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@@         @@@@@@@@@@@#@, , @@@:@@@@@@@                         @@@@@@@@`@@@   @@@@@@  @@@@@@@@, #@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@@         @@@@@@@@@@@@@@  ,@@@'@@@@@@.                         @'  @@@@ @@@   @@@@@@  '@@@@+;@@ '@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@#     ;   @@@@@@@'   :@@, @@@ @@@@@@                               @@@@ @@@   @@@@@@  #@@@@@# @,`@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@#    @@   @@@@@@.  ,  +@,:@@@:@@@@@                                @@@@ @@@   @@@@@. '@@@@@@#.@  @@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@+   +@@  @@@@@@@ .@@   @.@@@ @@@@:                                 @@@@`@@#   @@@@# :@@@@@@@@@@  @@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@+  :@@@ @@@@@@@, @@@   @@@@ @@@@                                   @@@@,@@;   @@@@  @@@@@@@@@@@  @@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@+  @@@@@@@@@@@# @@@@   @@@.+@@@.                                  @@@@ @@@:   @@@' @@@@@@@@@@@#  @@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@+  @@@@@@@@@@@ @@@@+   @@@ @@@@                                  ;@@@;;@@@#   @@@ @@@@@@@+ @@@   @@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@+ `@@@@@@@@@@ '@@@@;   @@@`@@@;                                 #@@@@,@@#@@   @@  @@@@@@,  @@    @@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@# +@ @@@@@@@  @@@@@,   @@@:@@@,                                @@@@@ @@@ @@   .  @@@@@@@   @+    @@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@@ @@ @@@@@@. :@@@@@,  :@@@+@@@,   .                          :@@@@@'@@@# @@@    +@@@@@@@   @    .@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@@ '@@ @@@@@  '@@@@@:  #@@@'@@@#  #+                         +@@@@@@ @@@  #@@@@@@@@@@@@@@   @    '@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@@  @@@@@@@@, ;@@@@@;  '@@@'@@@@@@@.                        +@@@@@@@,@@' ` @@+@@@@@@@@@@+   ,    #@@@@@@@@ "); 
      System.out.println("   .  @@@@@@@@@  `@@@@@@@@ .@@@@@+  ,@@@'@@@@@@@                        `@@@@@@@@'@@,@    ;@@.`'++@@@         @@@@@@@@@ "); 
      System.out.println("   .  +@@@@@@@@     @@@@@ . @@@@@@   @@@,@@@@@@:                        @@@@@@@@@'@@@     @@ #;  @@@          @@@@@@@@@ "); 
      System.out.println("   .  `@@@@@@@@`       @@@@ @@@@@@   @@@ @@@@@@                        +@@@@@@@@ @@@@     @@ @  @@@@@;        @@@@@@@@@ "); 
      System.out.println("   .   @@@@@@@@@            @@@@@@   #@@ @@@@@                        `@@@@@@@@ '@@@@ ;, @@;+@ @@@@@@@        @@@@@@@@; "); 
      System.out.println("   .   @@@@@@@@@            @@@@@@    @@`@@@@  ,                      @@@@@@@@, @@@@+@@ @@@;@@@@@@@@@@       ;@@@@@@@@. "); 
      System.out.println("   .   @@@@@@@@@            @@@@@@`   @@+@@@@@@@                     +@@@@@@@@ @@@@@@@@,@@@@@@@@@@@@@,       @@@@@@@@@  "); 
      
      System.out.println("Shimada Logo");
      
      
    }
    
    else if (numAscii == 10)
    {
      
      System.out.println("   .    :.              ,..,;';'#++++''''';;;;;;+;;;;;+++'+++++''';:,,,,.,,,,;+';;;;;;,,:;;###@##################@@@+++'''''':;;;;'';:::#++++++++++++++++#####@@@@@@@@@@@@@@@##+'@@@@@@@@@@@@@@@@@@@@@+++++''''"); 
      System.out.println("   .   '::             ``.,::;+'+++++''''''''';;+'';''''''''''''''',,,,,.,,,,;+;;;;::::::::#';@''';;;'''''''''''+'+@++'''''''::::;';;;;;+++++++++++++++++++++#@@@@@@@@@@@@@@@@#+'@@@@@@@@@@@@@@@@@@@@@++++++++'"); 
      System.out.println("   .   :::,          `,`,,:::;+;;:,,,.........,''++'''''''++++'++''::,,,.,,:,;+;;;;;:::::::#';@''';;';'''''''''''''@++'''''';:;;;;'';;;;#+++++++++++++++++++++@@@@@@@@@@@@@@#@@''@@@@#@@@@@@@@@@@@@@@@+++++++++"); 
      System.out.println("   .   ;;;:`        ```.:;::;'';;;+++,..```````;'#+'+++'+++++++++'';,,,,.,,:,;';;;;;:::::::#';@''';;;;;''''''''''''@++'''''';:;;;;'';;;;++++++##++++++++++###+@@##@@@@@@@@@@+@@#'@@@@#@@@@@@@@@@@@@@@@##+++++++"); 
      System.out.println("   .   ;;;;:      ..,.,,,:;';'';::'#++...`````.;'#+'';;'''''''''''';,,,,.,,:,;';;;;;;:::::;#+;@''';;'''''''''''''''@++'''''';:;;;;+'';;'#+#+++########+##+###+@@@@@##########@@#+@@@@#@@@@@@@@@@@@@@@@###++++++"); 
      System.out.println("   .   ;';;:;,..,,::::::;;;''''';'+''',..`````.;+#+'';'''''+++++''';,,,,.,,:,;';;;;::::,:;;#+;#'''''''''''''+''''++@++'''''';:;;;;+'';;'###+++####+#++++#+###+@@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@@@@#####++++"); 
      System.out.println("   .   ;';';''';::::;;;';''''+'+#'+#+#+..````..'+##+''''''''+++++'';,,,,,,,:,;';;;;;:::::;;#+'+++++++++++++++++++++@++'''''';:;;;;+'';;'++##+####++#++++#+###+@@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@@@@######+++"); 
      System.out.println("   .   ';;;;++'';;;;;';''''''+#++##+#+#..````..'+##+''++'''+++++''';,,,,,,,:,;+;;;;;;::,:;;#+'+++++''++++++++++++++@++++''''':;;;;+'';;'+++######+++++########@@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@@@@#######++"); 
      System.out.println("   .   ;;';;'+++''';''''+'''''''+'###++'..```..'+##++'+++++++'++++';,,,,,,,::;+;;;;;;;;;;;;#+'''''''+++++++++++++++@+++++++'';;;;;+'';;'+''+#####+++##########@@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@@@@########+"); 
      System.out.println("   .   '+';''++++'+'''+'''++++''++++##++'::::,.+###+++++++++++++++';::,,,,,::'+'';;;;;@@@#@##+++'''';'';;''#++++###@#+++++''';;;;'+'';;'++++###+##############@@@@@@@@@@@@@@@@@##@@@@@@@@@@@@@@@@@@@@@#########"); 
      System.out.println("   .   ';''''++++++++++''++++++#'++++++'+';;+#####@#@@#@###++++++++;::,,,:,::'+''';;;;@@@@#@#######################@@+++''''';;;;'+''';'++++#################+#########@##@######@@@@@@@@@@@@@@@@@@#@@#########"); 
      System.out.println("   .   '''';'#++++++++#++##++#++'#+##+'+++#@@##################++++':::,,:,::'+''';;;;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@++'''''';;;;;+'';;'#''+#################+###################@@@@@@@@@@@@@@@@@@@@@#########"); 
      System.out.println("   .   +'''''+'++''++####++##+#+##+++++++++#####################+++'::::,:,::'+'''';;'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+''''''';;;;'+'''''#++######################################@@@@@@@@@@@@@@@@@@@@@#########"); 
      System.out.println("   .   ''''+'+++++++########++####+##+#+#+#'##########@#@@@@@@#####':::::::::'+''''';'@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+'''''';;;;;'+'''''#++++++++++++++@@@@@@####################@@@@@@@@@@@@@@@@@@@@@#########"); 
      System.out.println("   .   ;'''''+#+++++########+###+##++##++++#+####@@@###############+;::::::;:'+'''';;;@@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@+'''''';:;;;'+'''''#++++++++++++++@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@#########"); 
      System.out.println("   .   '''''++++++'+##############+##++#+#+++#@@###########@@@#####+;;:::::;:'+'''''';@@@@#@@@@@@@@@#@@@@#@@@@@@@@@@@+'''''';:;;;'+''''++++++++++++++++@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@########"); 
      System.out.println("   .   +++'''+++++++###@########+###+#####++++###########@@@@@#####+;;;::::;:'+'''''''@@@+@@@@@@@@@@#@@@@#@@@@@@@@@@@+'''''';:;;;'++'''++#########+++++@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@#########"); 
      System.out.println("   .   '''''++++++++#@@###@#####+######@#++##+#@#@@#@##@@@@#@#######;;;;:;:;:'+'''''''@@#@@@@@@@@@@@#@@@@#@@@@@@@@@@@++''''';:;;;'+''''++++++#####+++++@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@#########"); 
      System.out.println("   .   '''''+#++++++##@@###############+++#+++#@@@@@@@@@@@@@@@@##@##';;;;;:;;'+'''''''@@@@@@@#@@@@@@#@@@@@@@@@@@@@@@@+'''''';:;;;'++'''++++######++++++@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@########"); 
      System.out.println("   .   +''+++#++++''##@@@@@##@####@##++++#++###+@@@@@@@@@@@@@@@##@@#'';;;;;;;'+'''''''@+@@@@@+##################@@@@@+'''''';;;;;'++'''+++++#++#+###+++@@@@@@#++++++++++++++++++@@@@@@@@@@@@@@@@@@@@@@@@#######"); 
      System.out.println("   .   ;;+;++#++++++##@@@#@##@###########+##++#+#@@@@@@@@@@@@@@@#@@#''';;;;;;'+'''''''#@@@@@#+@##################@@@@++''''';;;;;'++'''+++++#+######++#@@@@@@#++++++++++++++++++@@@@@@@@@@@@@@@@@@@@@@@########"); 
      System.out.println("   .   +++#++#++++++###@@@@##@###@####++##@####++@@@@@@@@@@@@@@#@@@#'''';;;;;'+'''''''#@@#@@+;'+++'+++######@@@##++@@++''''';;;;;+++'''++++++##+++++++#@@@@@@#++++++++++++++++++@@@@@@@@@@@@@@@@@@@@@@@#+######"); 
      System.out.println("   .   #+++'++++++++###@@@@###@##@###+###+++######@@@@@@@@@@@@@@@@@#+'''';;;;'+'''''+'@@@@@###+'''++++++++''';;;;'+@@++++'''';'';+++'''+++++######+++##@@@@@@#+++++++++++++++++#@@@@@@@@@@@@@@@@@@@@@@@@+######"); 
      System.out.println("   .   ++'+'++++++'+####@@@@@#@@#######+###++######@@@@@@@@@@@@@@@@#+'''';;';'+'''''+@@@@@##+;;;'';;;';;;;;;::+#;;'@@++++++'';'';+++'''++##++++++#+####@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@@#######"); 
      System.out.println("   .   ++++#+'++++++####@@#@@#@@##@########@#++##++@@@@@@@@@@@@@@@@#++'''';';'+'''''#@@@@@@#':::::,::::,:::::,:::;'@@+++++++';'''+++'''++##############@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@########"); 
      System.out.println("   .   +++##''++++++####@@@@@##@####@####@#@########@@@@@@@@@##@@@@#++'''';';'+++''+#@@@@@@@@##############++++''+@@@++++++++''''+++'''+#++############@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@########"); 
      System.out.println("   .   +++++######++####@@@@@@@@#@@#@#@#####+##+#+##@@@##@#######+++++''''''''++++#@#@@@@@@##@@@@@@@@@@@@@@@@@@@@@@@@++++++++''''+++'''+#+###+++++##+##@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@########"); 
      System.out.println("   .   ++++++++++#++#####@@@#@@@@@@#@#@#@#@#@+##++###++'''''''';';''''+'''''''++#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@++++++++''''+++'''+############+##@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@######+#"); 
      System.out.println("   .   +++++++++++++#####@@@@@@@@@@######@####+@+###+++++''''''';'''+++++'''''#+###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@++++++++''''+++'''++####+#########@@@@@@###################@@@@@@@@@@@@@@@@@@@@@@@#####+##"); 
      System.out.println("   .   +++++++###+++#####@@@@@@@@@@########@@######+++''+''''''''''++#+++''''++#@+@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+++++++'''''+++'''+######++#######@@@##@###################+@@@@@@@@@@@@@@@@@@@@#######+##"); 
      System.out.println("   .   +++++++###+++######@@@@@@#@@@#####@####@#@#++''+''''''''''''++##++''''++#@###@@@@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@+++++++'''''+++'''+#####################@##################'+@@@@@@@@@@@@@@@@@@@@######+##"); 
      System.out.println("   .   ++++++#+##+++######@@@@@@@#@@######+###+##+++''''''''''''''++###++''''++++####@#####@@@@@@@@@@@@@@@@@@@@@@@@@@+++++++'''''+++'''######################@##################;;#@@@@@@@@@@@@@@@@@@@@#+##+#@#"); 
      
      
      System.out.println("Apartment room which McCree and Reyes invade.");
      
    }
    else if (numAscii == 11)
    {
      
      System.out.println("*******************/////////////////////////////////(#//////////////**/*********/////////////////////////***********************************///////////////////"); 
      System.out.println("******************//////////////////////////*/////*/###///////////***(/((*******/////////////////////////********************************//////////////////////"); 
      System.out.println("****************////////////////////////////#(/////*/(((//*///////****#/,*******////////////////////////********************************///////////////////////"); 
      System.out.println("************////////****////////////////////###////*/(/(((#////****(*,.*(,*******//////////////////////*********************************///////////////////////"); 
      System.out.println("*************/////*******////////*#/////////#(#(/**/(((/(((((((/*/*,    .(,******/////////////////////**********************************////////////////////((#"); 
      System.out.println("***************************/*////##/////////(#/#(//(/(##((((((((((#(///, .(******////////////////////************************************//////////////////((##"); 
      System.out.println("*********************************(#*(////////((/#((((//(*.,**/(((((((((#(////***////////////////////**************************************////////////////////("); 
      System.out.println("//*******************************###%(****//#((((#(((((#(//(*..,,*/(((#(((((((/////////////////////**************************************///////////////((((((/"); 
      System.out.println("///****************#(*************(###/((*/(#(##(///((((##/##(//(**,,,*((/((((#(((((///(/(#(//////***************************************//////////(((//(((//(("); 
      System.out.println("******************/(*************/(#*####(/(/(##,,.,,///(#########(*/(**,,,**((((((((((#(((//////*************************************//////////((/###(/##/,/(("); 
      System.out.println("//****************//***********/#(#/#(((###(/((*.   .,,*///(((##(####(//(/,,,,,*/((((#(//////************************************//////////(/((#(/(#((//*(/(("); 
      System.out.println("/////*************/&%%#*********//####(##((((((##(//(/,   .,,,**/((((#######(//(/,..*(#(///////*********************************//////////////((((((/.,.,######"); 
      System.out.println("******************(&(%&((*******/(#####(#(/(((((##/##((//(/,   .,,,*/(((##(####(#(///(////////*******************************/////////////////((///((/. *,*(###"); 
      System.out.println("*******************(#%%#/(#(****/#####**.**//(((((#########(//(/,  ,%%%#(/((((#(##(####((//((/*****************************//////////((////(,///#(((*(((##(##(#"); 
      System.out.println("*******************(##(%#%%#/(#(/####(,,    .,**/(((((######(###(//((/#%%%%%%#//(/((#####(#((##(///(#%*******************///////////((///(((///(///*(####//####"); 
      System.out.println("*******************/###(%%###%%#//##//((.       .,****/(((#(#########(///(/(#%%/******/(###(#((((#(/(****,,,,***********//////////*((.*(((//(((/((((*#*###*%%%("); 
      System.out.println("******//*****//***((####(%%%#%###%%%#//#(***/,     /%#/****/(((############(((#(%%/  .,,***//((((#(*,,...   .......,**///////////.../((#(/(#((((###**./%##%%("); 
      System.out.println("/*******///*******(####%%###(##%%%####%%%(//#(/**/,(%%%%%&%(****//(#%####%%#*/(*/#//((*.    .,,/#(..               .,,**,,,**,,,......(/((((#((##*###/(/###*#"); 
      System.out.println("(/********//****///#####%*(((((#####%%##%##%%##//#(//##%%%%%%%&%#/***//(/*//,*//##,*(##(//((*. ,/                   ....      .. ....*,/((/(,%%#######(###(,#&*"); 
      System.out.println("%#(/*******//**////%%%%%#,*.,***/(#(################//(#(/(##%%%%%..,*//,,(**,,,.*%***#######(//((/,.              *         .   ... ./((*##(###(,(##(#%%&&&&&&"); 
      System.out.println("/%%%(///(****////(##%%%%**.     ,,****/(((((######(%%%%##(//(#(/*/(/,,*(**,,..    .(%,*/######(#####(///((/,....,*/#.       .*,........,####(###/((/###(#######"); 
      System.out.println("(**(%%(/#/(/*****/#%%#((//.         ..******/(#((%#########%%%##//(#(/*,,.          *%/**/((##########(#(####((//#%  .    .. ,,..........(*,(####(((######&%%%&"); 
      System.out.println("(((**/%%%#//(((/(/////(((((/(*.         .,.,******/(((((####%(%%##%%##//(#(/,        ./%,******//(((#((#######(,,.   . ..  ..*.,.,*,.,((,*.(#/#.*((############"); 
      System.out.println("%#(#(/*/(#/(##(//#%%#%%%%%(((/**//(*.   (/**//*,,,******/(###############%##//(((/,.   ,##,/*///*******//((#...................,...,/,/,,,,**(#*((##((#####,(#/"); 
      System.out.println("%%%%#(((**/(/#(//###(////////(/(//(*,*/(#&&%(/*****//*,*******/(#(((##############(//(((**%/,**/***   ..,,**.................../*,../,//*,,**..#%/##(#//#//(###"); 
      System.out.println("&%%%%%#((#/*(#/(%%%#//(###(////(//(/////((##%%%&&/*****/..,********/(#(/(######%(######(//(((**//*/*,.  .......,...,......././**..////###//((#%%//*,*.**(####"); 
      System.out.println("%%&&&&&%%%%%##(%((#/(%(%%%%%%%%#(//###((*//((///((//(((###((/.         ..*********//*((/(.,/*.##,,/..#,/,,.,....,,,.......*,.....,/**((,((((/###(/%((#/*###((#%"); 
      System.out.println("#%%%%&&&&&%%%%%((##/###%%%#%%%%%%%%%%#(//(###(/////////(//(///***/(/,    ///////****,,*.,,,,/,/*,*.(/((/....,..,,,,,,......,*...((##(.(###########(%###/(#(//(#"); 
      System.out.println("((###%%%%&&&&%%%%%(((#//(/(#%%%%%%%%%(%%%%%%%#//(###(/*///////////(///**/(///**/**///,...,,,*,,,,*,....,*,.,/,,,,,.,,.,..****,.*,(((((*,(((/#####%#(####/(#####"); 
      System.out.println("((((((##%%%%%&&&%%%%%(((##//(//(#/(%%#%%%%%%%%%%%%##(//(###(/////////(////((/*//,.//**,,,,.....,,.,.,..,,/...,**(*,,*,.../*/,/(/*((###((###*(##%##(#&&&//####%#"); 
      System.out.println("%##((((####%%&&&&&&%%%%%#(((%%#(/((##%#((##%%%%%&&&%%%%%##(//(###(///////////(.//,,**,,,,,.,.,..,,*,%&(#*,,*/((*,**//#(/##/(/(/*/(/*(#(///(*#(,(%%&&&&%%&&&&&"); 
      System.out.println("%%%%##((######%&&&&&&&&&&&%%#(#(%/*/*///((##%%%#%%%%%%&&&&&%%%%%%%%#(/(###((///**...,,,,,/,,,.,,,,,*((****#*//(/*/*//((/(###//((/(/(((###(((*,###%%###%%%#%%&"); 
      System.out.println("//(%%%%%#(((####&&&&&&&&&&&&&&%%#*,***////////(((#%%%%%%%%%%%%&%#%%%%%%%%%%(/,,,,.,..,*,///*,,*(,/(/(##(,/#(%,(((/*/,/(/##%(//((((/(####((###((*###%###%&%#%#"); 
      System.out.println("//////#%%%%%####&&&&&&&&&&&&%/.       .(%#(//((((((((((((#%%%%%%#%%%%%%%%%%%#%#*/,,,,*,,**,,,////*(,##(*,,/(/(#&&%(//(/,(((((,,/(((/(#%#*/########((#%###%(####"); 
      System.out.println("#%#/****/(%%%%%%&&&&&%(//(((*..       .#&%%&&&&&%#((((((((/////((##%%#####,,(,,*,,,,,,,*,,*,*((//*//(#/((/((((**#&&((((/((((/(&%(/(((##(/((//(####((#%%%&%#####"); 
      System.out.println("%%%#%#/**/*//#%%%%&&##(*,,*/////#(/*,%%&%%&&%%&%&&&&&&&%#(///////////////((,#/*/,(,*((**/*//#/#(//(//((/(((((*(((%&(((,,*//(%#(((((#(((//((#######&%##%/%##"); 
      System.out.println("%%%%%###%/****//(%%%&&(((((/(((/*,,*/(/%&%%&%%%%&&&%%&&&&(.  ..,***/////*,,///(/**(((//*(//(((**/*/#/*/#((((*,*###(#%%%/(((,,*(/*///%%((((///((###((#(##/##(#"); 
      
      System.out.println("Shimada Castle");
      
      
    }
    else
    {
      
      System.out.println("'+'''+'''+''''+++++++++++++###################+++''+'''''''+'+'+''''';;;;;;;;;;;;;;;;;';'''''''''''''''+++++++++++++++++++++++''++''''++##''+';+'++++++'+++++'''+++#++++##++++++++++++++++++++++++++++++");
      System.out.println("++'''+'''+''''+++++++++++++##################++''+'+'''''''+'''++'''';';;;;;;;;;;;;'';''''''''''''''''++++++++++++++++++++++++';:;'';'+'##''++';+#+++'+++++++++++++#+++###++++++++++++++++++++++++++++++");
      System.out.println("'''''+'''+'''''++++++++++++###############++++++'+'+'''''++++++''''''';';;;;;;;'';'''''''''''''''''''''+++++++++++++##+++++++'+`.,.;;+',:#+++'+#+##+'++'+++++++++++##+#+##++++++++++++++++++++++++++++++");
      System.out.println("'''''+'''+'''''++++++++++++#################+++'''++++++++++++''''''''';;;;''';''';''''''''''''';'''''++++++'++++++++++##++++++...`.:+,..#''++++#+'+++++'++++++++++#######++++++++++++++++++++++++++++++");
      System.out.println("'''''+'''+'''''++++++++++'+##+##++++#####+++#++'+'#++++++++++++''''''''';';'''''''''''''''''';:;;:''''+++++++++++++#+++++###+'+`,:``;+..:#+++##+'+###+#++++++++++++#######++++++++++++++++++++++++++++++");
      System.out.println("'''+++'''+'''''++++++++++'++++######+#####+++++'++++++++++++++''''''''''''''''''''''''''';:,;';;;':;'''++++++++++++####+#####'',,,`,;+,.`#++++++++###+#++##++++++++##########+++++++++++++++++++++++++++");
      System.out.println("'''+'+'''''''''++++++++++'+''+##++#####+#####++++#+++++++++++++'''''''''''''''''''';';;;;:;;:;;;;;;':;''+++++++++++++##+#++++''..,..;+,..##++++++###+++++#++##+++++####+#########+++++++++++++++++++++++");
      System.out.println("'''++++''''''''++++++++++''''###++++#########+++'++++++++++++'''''''''''''''''';;;;;;;;::';,:::;;;;;''''++++++++++++++#####++''.:,`.;+'.:#+++++######++###+###+#######+#############++++++++++++++++++++");
      System.out.println("'''+++'''''''''++++++++++''''+################+'++#++++++++++'''''''''''''''';;::::::,:,::;'::::;'''';;;'++++++++++++########'',.,,,;+;,,#++++######+++#++###+#######+##################++++++++++++++++");
      System.out.println("'++++++''+''''++++++++++'''''+############+';;++'+#+++++++++++''''''''''';;';;:::,,,:;,,,::;+;;'''';;;;;;;+++++++++++########''.::..;+,:;#++#######+#+##+###+###+########+++###############+++++++++++++");
      System.out.println("'''++++''+''''++++++++++''''+##########+';++##+'++#+++++++++++''''''';;;;;;;;::,,,..,';:,::::''';;;;;;;;;''++++++++++#####++#'',,:,:;+';:#########+#++#++##+#############+++++++###############+++++++++");
      System.out.println("++++++++'+''''+++++++++'''''''####++'+####+++#+++##++++++++++'''''';;;::::::::,...```;';:,::::::;;;;;';;''''+++++++++#######+'',,:,.;+,':##########++##++#+##+###########++++++++++################+++++");
      System.out.println("++++++++'++'''+++++++'++''''####''+#########++++'###+++++++'''';;;;;::::,,,,,,,.``````''':;:::::;;;''''''';''++++++++########'',,:,,;+:';##########+##++##+##+###+#######+++++++++++++#############+####");
      System.out.println("'+++++++'++''+++++++'''''''''+###########++++#+++##++++++'''';;;;;;:::,,,.......``````.''':;:::;;;;''''''::;;'+++++++###+++++';,,:,,;+;;;############+###+#################+++++++++++++++##############");
      System.out.println("++++++++'++''++++++'''''''''+################++''#+++++'''';;;::::::,,....```...``````,'+++;;::;'''++''',,::;;'++++++++++++++''::::,;+'''######+##+####++###+############++###+++++++++++++++###########");
      System.out.println("+++++++++++++++++++''''''''''++##############++++++++''''';;;:::,:::,..``````....``....'++++''''''+++'++,,,,:;;'+++++++++''''';;;;::;+''+################################++++####+++++++++++++++########");
      System.out.println("++++++'++++++++++++'''''+''##################++++++++''';;;:::,,,.,,..```````......```.'+;'''';'''++''++,,,,,:;;'++++++'''''';;;;;;;'++++##+##################+##########+++++++###+++++++++++++++++####");
      System.out.println("++++++'++++++++++++'''''+''################++++''+++++''';;:,,.........````.......````.',:;'''';;'+''''+.,,,,,:;;''++'''';;;:;';:;;''+++++#+++#######+###+###############+++++++++++##+++++++++++++++++#");
      System.out.println("+++++++++++++++++++'''''+''##############+++++++++++++'';;::,..```....``.......`..````.'..:'';''';:,::+'`.,,,,,:;;'''''';;;;;;;';;;''++'++++++++#########################++++++++++++++##+++++++++++++++");
      System.out.println("+++++++++++++++++++''''''''###############+++++''+++++'';;::,.`````........``````..```,'..,:'++';,,`..+'``.,,,,:;'''''';;;;;:;';;'';'++++++''+++++#######################++++++++++++++++###++++++++++++");
      System.out.println("++++++++++++++++++''''''+''+###########++++++++'++'';+;';::...`````......````````..```,'...,'++;,..`..+'``..,,::;;;;''';;;;;::;'';';''+'+##+'''+++#######++##############++++++++++++++++++++#++++++++++");
      System.out.println("++++++++++++++++++'''''''''#############++++#++''';;;+';:,,...``........``````````..``,'.,..;+:..`.`::++```.,:::::;;;;;;;;;;;;;:;''';'++#+++'''++++######################+++++++++++++++++++++++#+++++++");
      System.out.println("++++++++++++++++++'+''+'''+###########+++##++''';;;;;'';:,,........`...```````````..``,':.,.;',`.`:,,.'+``.,,:::::;;;;;;;;;;;;;;;;'+''++++++''''++++#####################+++++++++++++++++++++++++++#+++");
      System.out.println("+++++++++++++++++++++''''++++######++##++++++''';;:::;';:,,,,,..`````...``````````...`:'.,.,''.`:,.`,:++.....,::;:;;;;;;;;;;;;;;;';''++++++'+''''+++++###################+++++++++++++++++++++++++++++++");
      System.out.println("++++++++++++++++++++++''++###+###+##++++++++''';;;:;;:+;:::,..```````...```````````..`:',.,.'':.,...:.'+.``..,:;;;;;;;;;;;;;;;;;;'''''++++'+';''''++++###################+++++++++++++++++++++++++++++++");
      System.out.println("+++++++++++++++++++++++##+++#+###+++++++++++''';;;;;'++'::,,,..```````..````````````..:',.,,'',`,,:.,.'+``...,,:;;;;;;;;;;;;;;;;;'''''++''+';;;'''+++++###################++++++++++++++++++++++++++++++");
      
      System.out.println("Inside Shimada Castle");
      
      
    }
    
  }
}









