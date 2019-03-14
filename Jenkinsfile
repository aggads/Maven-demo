pipeline {
  agent {
    node {
      label 'build'
    }

  }
  stages {
    stage('Pull') {
      steps {
        git(branch: '/master', url: 'https://github.com/aggads/Maven-demo')
      }
    }
    stage('Build') {
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