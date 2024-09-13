
package com.lpu.mlservice.service;

import org.springframework.stereotype.Service;
import org.tensorflow.Tensor;
import org.tensorflow.Graph;
import org.tensorflow.Session;
import org.tensorflow.ndarray.NdArrays;
import org.tensorflow.ndarray.Shape;
import org.tensorflow.types.TFloat32;
import org.tensorflow.types.TFloat64;

@Service
public class MLService {

//	public boolean predictProfit(double[] tradeResults) {
//		try (Graph graph = new Graph()) {
//			try (Session session = new Session(graph)) {
//				Tensor<TFloat32> input = TFloat32.tensorOf(NdArrays.vectorOf(tradeResults));
//				Tensor<TFloat32> prediction = session.runner().feed("input", input).fetch("output").run().get(0)
//						.expect(TFloat32.DTYPE);
//				float predictionValue = prediction.data().getFloat();
//				return predictionValue > 0.5;
//			}
//		}

	public boolean predictProfit(double[] tradeResults) {
		try (Graph graph = new Graph()) {
			try (Session session = new Session(graph)) {
				// Create a TFloat64 tensor for double precision data
				Tensor<TFloat64> input = TFloat64.tensorOf(NdArrays.vectorOf(tradeResults));

				// Run the session, feeding input and fetching output
				Tensor<TFloat64> prediction = session.runner().feed("input", input).fetch("output").run().get(0)
						.expect(TFloat64.DTYPE);

				// Get the prediction value
				double predictionValue = prediction.data().getDouble();

				// Return true if the prediction is greater than 0.5
				return predictionValue > 0.5;
			}
		}
	}
}
