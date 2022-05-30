package com.injectors.up.mapping;

import com.injectors.up.Request.RequestTest;
import com.injectors.up.model.Test;

public interface TestMapper {

    Test getTestForCreated(RequestTest requestTest);
}
