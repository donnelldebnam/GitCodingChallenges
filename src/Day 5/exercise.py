# This program is a walkthrough of using a recurrent neural network to classify
# images within the MNist dataset.

# In[94]: Part I
import tensorflow as tf

#
# Upload the 'MNist' dataset, consisting of 60,000 images of handwritten 
# digits (0 through 9) in a 28x28px format.
#
mnist = tf.keras.datasets.mnist

#
# Unpack the data into two beds. One bed is for training the network, the other will
# be for actually testing the network. 
#
(x_train, y_train), (x_test, y_test) = mnist.load_data()

#
# Normalization of the values in each array, or bed, scaling each of the
# entries to some value between 0 and 1.
#
x_train = tf.keras.utils.normalize(x_train, axis=1)
x_test = tf.keras.utils.normalize(x_test, axis=1)

#
# For the neural network, we'll just use the simplest type of network, a Sequential
# multi-layer perceptron. This is simply a model in which the layers are a linear stack.
#
model = tf.keras.models.Sequential()

#
# Creates a 4-layer network with an output range of 10 (digits 0-9):
#       Layer 1: A 28x28 matrix flattened into a 784x1 vector as an input (784 neurons)
#       Layer 2: Second layer –– the first hidden layer –– comprised of 128 neurons
#       Layer 3: Third layer –– the second hidden layer –– comprised of 128 neurons
#       Layer 4: Fourth layer –– output layer –– of 10 neurons (1 neuron for each possible output of 0-9)
#
# Each of the layers uses the Sigmoid function, defined as: s(x) = 1 / (1 - e^-x). This squishes
# each of the values into a range between 0 and 1 <-- We call this the "activation function"
#
model.add(tf.keras.layers.Flatten())
model.add(tf.keras.layers.Dense(128, activation=tf.nn.sigmoid))
model.add(tf.keras.layers.Dense(128, activation=tf.nn.sigmoid))
model.add(tf.keras.layers.Dense(10, activation=tf.nn.softmax))

#
# Compiles the network and runs the training algorithm, which is essentially just the backpropagation
# algorithm involved to correct the network once it makes inaccurate guesses initially, before the images are
# learned. For the optimizer we use Adam, however, the most common one is Gradient Descent.
#
# The metrics we want to report on are just the accuracy, and we also want to run 3 epochs, which just tells
# our model that we want to run through the training data 3 times.
#
model.compile(optimizer='adam',
             loss='sparse_categorical_crossentropy',
             metrics=['accuracy'])
model.fit(x_train, y_train, epochs=3)


# In[104]: Part II
import numpy as np

# 
# We'll duplicate the model into new_model, which will allow us to manipulate some parts of the trained
# network without affecting the actual network itself.
#
new_model = model

#
# We tell the network we want to now make predictions for each of the 60,000 images found in the collection
# of learned images.
#
# predictions[2001] simply corresponds to the digit that our network has predicted for image 2,001/60,000
# We then print the prediction.
#
predictions = new_model.predict([x_test])
print(np.argmax(predictions[2001]))


# In[103]: Part III

#
# Import for matplotlib, which essentially allows us to plot and view
# our mathematical models 
#
import matplotlib.pyplot as plt

# 
# Lastly, we plot the actual handwritten image at the same index, 2001, which is what the network
# based its prediction off of.
#
# Simply put, there was an array (x_test) which contains all of the 28x28 images, and a new array (predictions)
# which holds the network's thoughts for each image in `x_test`.
#
plt.imshow(x_test[2001], plt.cm.binary)


# %%
