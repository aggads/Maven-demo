pipeline {
  agent any
  stages {
    stage('Clone') {
      agent any
      steps {
        git(branch: '/master*', url: 'https://github.com/aggads/Maven-demo', credentialsId: '8b51296e-202d-4987-8653-109000d0fa13')
      }
    }
    stage('Build') {
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