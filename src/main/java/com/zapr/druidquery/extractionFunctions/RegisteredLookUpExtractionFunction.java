/*
 * Copyright (c) 2017-present, Red Brick Lane Marketing Solutions Pvt. Ltd.
 * All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.zapr.druidquery.extractionFunctions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zapr.druidquery.lookUpSpec.LookUpSpec;

import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisteredLookUpExtractionFunction extends ExtractionFunction {

    private LookUpSpec lookUp;
    private Boolean retainMissingValue;
    private Boolean injective;
    private String replaceMissingValueWith;
    private Boolean optimize;

    @Builder
    private RegisteredLookUpExtractionFunction(LookUpSpec lookUp, Boolean retainMissingValue, Boolean injective,
                                               String replaceMissingValueWith, Boolean optimize) {
        this.type = ExtractionFunction.LOOPUP_TYPE;
        this.lookUp = lookUp;
        this.retainMissingValue = retainMissingValue;
        this.injective = injective;
        this.replaceMissingValueWith = replaceMissingValueWith;
        this.optimize = optimize;
    }
}
