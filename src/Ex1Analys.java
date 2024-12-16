public class Ex1Analys {

        public static void main(String[] args) {
                //1
                boolean knightIsAwake = false;

                System.out.println("Putem face un atac supriza ? " + AnnalynsInfiltration.canFastAttack(knightIsAwake));
                //2
                knightIsAwake = true;

                boolean archerIsAwake = false;

                boolean prisonerIsAwake = false;

                System.out.println("Putem spiona grupul ? " + AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
                //3
                archerIsAwake = true;

                prisonerIsAwake = true;

                System.out.println("Putem semnala catre prizonier ? " + AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
                //4
                knightIsAwake = false;

                archerIsAwake = false;

                prisonerIsAwake = true;

                boolean petDogIsPresent = false;

                System.out.println("Putem elibera prizonierul ? " + AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
            }
        }
