package com.manoj.codegen.gen.services;

import com.manoj.codegen.gen.beans.Setup;
import com.manoj.codegen.gen.constants.ProjectVersion;
import lombok.NonNull;

public interface ProjectSetup {

    Setup setupProject(@NonNull ProjectVersion projectVersion, @NonNull String basePath);
}
