pipeline {
  agent {
    node {
      label 'Build'
    }

  }
  stages {
    stage('Build') {
      steps {
        git(branch: '/master', url: 'https://github.com/aggads/Maven-demo')
      }
    }
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
  }
}