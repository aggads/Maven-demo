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
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('test') {
      steps {
        sh 'mvn test'
      }
    }
  }
}