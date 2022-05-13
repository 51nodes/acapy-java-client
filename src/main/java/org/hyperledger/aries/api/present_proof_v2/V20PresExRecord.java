/*
 * Copyright (c) 2020-2022 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof_v2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.JsonObject;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hyperledger.acy_py.generated.model.V20Pres;
import org.hyperledger.acy_py.generated.model.V20PresProposal;
import org.hyperledger.acy_py.generated.model.V20PresRequest;
import org.hyperledger.aries.api.ExchangeVersion;
import org.hyperledger.aries.api.jsonld.VerifiableCredential;
import org.hyperledger.aries.api.jsonld.VerifiablePresentation;
import org.hyperledger.aries.api.present_proof.BasePresExRecord;
import org.hyperledger.aries.api.present_proof.PresentProofRequest;
import org.hyperledger.aries.api.present_proof.PresentationExchangeRecord;

import java.util.List;
import java.util.Optional;

/**
 * V20PresExRecord
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true) @ToString(callSuper = true)
public class V20PresExRecord extends BasePresExRecord {

    private V20PresProposal presProposal;
    private V20PresRequest presRequest;
    private V20Pres pres;
    private V20PresExRecordByFormat byFormat;

    public boolean isIndy() {
        return byFormat != null && byFormat.isIndy();
    }

    public boolean isDif() {
        return byFormat != null && byFormat.isDif();
    }

    @Override
    public boolean versionIsV1() {
        return false;
    }

    @JsonIgnore
    public ExchangeVersion getVersion() {
        return ExchangeVersion.V2;
    }

    public PresentProofRequest.ProofRequest resolveIndyPresentationRequest() {
        if (byFormat != null) {
            return byFormat.resolveIndyPresentationRequest().orElse(null);
        }
        return null;
    }

    /**
     * Returns typed dif presentation request
     * @return {@link V2DIFProofRequest}
     */
    public V2DIFProofRequest<V2DIFProofRequest.PresentationDefinition.InputDescriptors.SchemaInputDescriptorUriFilter> resolveDifPresentationRequest() {
        if (byFormat != null) {
            Optional<V2DIFProofRequest<V2DIFProofRequest.PresentationDefinition.InputDescriptors.SchemaInputDescriptorUriFilter>>
                    res = byFormat.resolveDifPresentationRequest(V2DIFProofRequest.INPUT_URI_TYPE);
            return res.orElse(null);
        }
        return null;
    }

    public JsonObject resolveIndyPresentation() {
        if (byFormat != null) {
            return byFormat.resolveIndyPresentation();
        }
        return null;
    }

    public VerifiablePresentation<VerifiableCredential> resolveDifPresentation() {
        if (byFormat != null) {
            return byFormat.resolveDifPresentation();
        }
        return null;
    }

    public List<PresentationExchangeRecord.Identifier> resolveIndyIdentifiers() {
        if (byFormat != null) {
            return byFormat.resolveIndyIdentifiers();
        }
        return List.of();
    }
}
