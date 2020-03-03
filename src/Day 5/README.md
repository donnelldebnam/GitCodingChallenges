## Day 5 Exercise (Machine Learning w/ TensorFlow)

### What is TensorFlow?

By definition, TensorFlow is a free and open-source software library for dataflow and differentiable 
programming across a range of tasks. It is a symbolic math library, and is also used for machine learning 
applications such as neural networks.

### What are we using this for?

We'll be using TensorFlow's Keras API for building and training deep learning models. We do this by 
importing one of the supported datasets, in our case MNist, and then create a neural network to
train the network and later test its accuracy.

### Before You Begin...

* If this is your first exercise, fork the root repository and clone the repo to your account with 
  ```
  $ git clone https://github.com/<YOUR_USERNAME>/GitCodingChallenges
  ```

* After cloning, make sure the remote is set to your account with:
  ```
  $ git remote -v
  ``` 
  which should return a link to the GitHub repository with your username in it

### Using TensorFlow & Keras

* Be sure that you have installed Miniconda on your personal machine

* Install the following python modules as you'll need them to successfully run the Jupyter library:
  ```
  $ brew install tensorflow
  $ brew install numpy
  $ brew install matplotlib
  ```
  
### Tasks & Objectives

* Open `exercise.py` in your code editor, preferably Microsoft Visual Studio Code

* Run each cell independently and observe what the program produces as a result of each;
cells are split up into 3 parts (labelled I, II, and III)

* You should have something similar to this figure, where we have ***Part I:*** The training process, 
***Part II:*** The prediction, and ***Part III:*** The image the prediction was based on:

![Code Sample](https://i.ibb.co/xhLdBKg/exercise.png)

* We won't be doing an actual exercise for this project, however we want to gain an understanding
of how neural networks are used in machine learning
