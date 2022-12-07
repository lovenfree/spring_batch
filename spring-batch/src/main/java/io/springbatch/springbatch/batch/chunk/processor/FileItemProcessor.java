package io.springbatch.springbatch.batch.chunk.processor;

import io.springbatch.springbatch.batch.domain.Product;
import io.springbatch.springbatch.batch.domain.ProductVO;
import org.springframework.batch.item.ItemProcessor;

public class FileItemProcessor implements ItemProcessor<ProductVO, Product> {
    @Override
    public Product process(ProductVO item) throws Exception {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(item, Product.class);
  
    }
}
