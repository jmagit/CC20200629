pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
        stage("Compile") {
            steps {
                sh "./GildedRose.curso/mvn compile"
            }
        }
    }
}
