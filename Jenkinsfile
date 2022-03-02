pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage("Compile") {
            steps {
                sh "./mvn compile"
            }
        }
    //     stage("Unit test") {
    //         steps {
    //             sh "./gradlew test"
    //         }
    //     }
    //     stage("Code coverage") {
    //         steps {
    //     	    sh "./gradlew jacocoTestReport"
    //     	 	publishHTML (target: [
    //      	        reportDir: 'build/reports/jacoco/test/html',
    //      			reportFiles: 'index.html',
    //      			reportName: 'JacocoReport'
    //      	    ])
    //      		sh "./gradlew jacocoTestCoverageVerification"
    //      	}
    //     }
    //     stage('SonarQube analysis') {
    //         steps {
    //             withSonarQubeEnv('SonarQubePruebas') {
    //                 sh './gradlew sonarqube'
    //             }
    //         }
    //     }
    // }
}
