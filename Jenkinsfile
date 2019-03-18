pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('PackageDeliver') {
      steps {
        sh './jenkins/scripts/deliver.sh'
      }
    }
  }
}