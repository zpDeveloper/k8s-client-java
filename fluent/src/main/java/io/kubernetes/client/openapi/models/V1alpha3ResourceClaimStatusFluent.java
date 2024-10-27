package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3ResourceClaimStatusFluent<A extends V1alpha3ResourceClaimStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha3ResourceClaimStatusFluent() {
  }
  
  public V1alpha3ResourceClaimStatusFluent(V1alpha3ResourceClaimStatus instance) {
    this.copyInstance(instance);
  }
  private V1alpha3AllocationResultBuilder allocation;
  private Boolean deallocationRequested;
  private ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder> reservedFor;
  
  protected void copyInstance(V1alpha3ResourceClaimStatus instance) {
    instance = (instance != null ? instance : new V1alpha3ResourceClaimStatus());
    if (instance != null) {
          this.withAllocation(instance.getAllocation());
          this.withDeallocationRequested(instance.getDeallocationRequested());
          this.withReservedFor(instance.getReservedFor());
        }
  }
  
  public V1alpha3AllocationResult buildAllocation() {
    return this.allocation != null ? this.allocation.build() : null;
  }
  
  public A withAllocation(V1alpha3AllocationResult allocation) {
    this._visitables.remove("allocation");
    if (allocation != null) {
        this.allocation = new V1alpha3AllocationResultBuilder(allocation);
        this._visitables.get("allocation").add(this.allocation);
    } else {
        this.allocation = null;
        this._visitables.get("allocation").remove(this.allocation);
    }
    return (A) this;
  }
  
  public boolean hasAllocation() {
    return this.allocation != null;
  }
  
  public AllocationNested<A> withNewAllocation() {
    return new AllocationNested(null);
  }
  
  public AllocationNested<A> withNewAllocationLike(V1alpha3AllocationResult item) {
    return new AllocationNested(item);
  }
  
  public AllocationNested<A> editAllocation() {
    return withNewAllocationLike(java.util.Optional.ofNullable(buildAllocation()).orElse(null));
  }
  
  public AllocationNested<A> editOrNewAllocation() {
    return withNewAllocationLike(java.util.Optional.ofNullable(buildAllocation()).orElse(new V1alpha3AllocationResultBuilder().build()));
  }
  
  public AllocationNested<A> editOrNewAllocationLike(V1alpha3AllocationResult item) {
    return withNewAllocationLike(java.util.Optional.ofNullable(buildAllocation()).orElse(item));
  }
  
  public Boolean getDeallocationRequested() {
    return this.deallocationRequested;
  }
  
  public A withDeallocationRequested(Boolean deallocationRequested) {
    this.deallocationRequested = deallocationRequested;
    return (A) this;
  }
  
  public boolean hasDeallocationRequested() {
    return this.deallocationRequested != null;
  }
  
  public A addToReservedFor(int index,V1alpha3ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) { _visitables.get("reservedFor").add(builder); reservedFor.add(builder); } else { _visitables.get("reservedFor").add(index, builder); reservedFor.add(index, builder);}
    return (A)this;
  }
  
  public A setToReservedFor(int index,V1alpha3ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) { _visitables.get("reservedFor").add(builder); reservedFor.add(builder); } else { _visitables.get("reservedFor").set(index, builder); reservedFor.set(index, builder);}
    return (A)this;
  }
  
  public A addToReservedFor(io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference... items) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").add(builder);this.reservedFor.add(builder);} return (A)this;
  }
  
  public A addAllToReservedFor(Collection<V1alpha3ResourceClaimConsumerReference> items) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").add(builder);this.reservedFor.add(builder);} return (A)this;
  }
  
  public A removeFromReservedFor(io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference... items) {
    if (this.reservedFor == null) return (A)this;
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").remove(builder); this.reservedFor.remove(builder);} return (A)this;
  }
  
  public A removeAllFromReservedFor(Collection<V1alpha3ResourceClaimConsumerReference> items) {
    if (this.reservedFor == null) return (A)this;
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").remove(builder); this.reservedFor.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
    if (reservedFor == null) return (A) this;
    final Iterator<V1alpha3ResourceClaimConsumerReferenceBuilder> each = reservedFor.iterator();
    final List visitables = _visitables.get("reservedFor");
    while (each.hasNext()) {
      V1alpha3ResourceClaimConsumerReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3ResourceClaimConsumerReference> buildReservedFor() {
    return this.reservedFor != null ? build(reservedFor) : null;
  }
  
  public V1alpha3ResourceClaimConsumerReference buildReservedFor(int index) {
    return this.reservedFor.get(index).build();
  }
  
  public V1alpha3ResourceClaimConsumerReference buildFirstReservedFor() {
    return this.reservedFor.get(0).build();
  }
  
  public V1alpha3ResourceClaimConsumerReference buildLastReservedFor() {
    return this.reservedFor.get(reservedFor.size() - 1).build();
  }
  
  public V1alpha3ResourceClaimConsumerReference buildMatchingReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
      for (V1alpha3ResourceClaimConsumerReferenceBuilder item : reservedFor) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
      for (V1alpha3ResourceClaimConsumerReferenceBuilder item : reservedFor) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withReservedFor(List<V1alpha3ResourceClaimConsumerReference> reservedFor) {
    if (this.reservedFor != null) {
      this._visitables.get("reservedFor").clear();
    }
    if (reservedFor != null) {
        this.reservedFor = new ArrayList();
        for (V1alpha3ResourceClaimConsumerReference item : reservedFor) {
          this.addToReservedFor(item);
        }
    } else {
      this.reservedFor = null;
    }
    return (A) this;
  }
  
  public A withReservedFor(io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference... reservedFor) {
    if (this.reservedFor != null) {
        this.reservedFor.clear();
        _visitables.remove("reservedFor");
    }
    if (reservedFor != null) {
      for (V1alpha3ResourceClaimConsumerReference item : reservedFor) {
        this.addToReservedFor(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasReservedFor() {
    return this.reservedFor != null && !this.reservedFor.isEmpty();
  }
  
  public ReservedForNested<A> addNewReservedFor() {
    return new ReservedForNested(-1, null);
  }
  
  public ReservedForNested<A> addNewReservedForLike(V1alpha3ResourceClaimConsumerReference item) {
    return new ReservedForNested(-1, item);
  }
  
  public ReservedForNested<A> setNewReservedForLike(int index,V1alpha3ResourceClaimConsumerReference item) {
    return new ReservedForNested(index, item);
  }
  
  public ReservedForNested<A> editReservedFor(int index) {
    if (reservedFor.size() <= index) throw new RuntimeException("Can't edit reservedFor. Index exceeds size.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  
  public ReservedForNested<A> editFirstReservedFor() {
    if (reservedFor.size() == 0) throw new RuntimeException("Can't edit first reservedFor. The list is empty.");
    return setNewReservedForLike(0, buildReservedFor(0));
  }
  
  public ReservedForNested<A> editLastReservedFor() {
    int index = reservedFor.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last reservedFor. The list is empty.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  
  public ReservedForNested<A> editMatchingReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<reservedFor.size();i++) { 
    if (predicate.test(reservedFor.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching reservedFor. No match found.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3ResourceClaimStatusFluent that = (V1alpha3ResourceClaimStatusFluent) o;
    if (!java.util.Objects.equals(allocation, that.allocation)) return false;
    if (!java.util.Objects.equals(deallocationRequested, that.deallocationRequested)) return false;
    if (!java.util.Objects.equals(reservedFor, that.reservedFor)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allocation,  deallocationRequested,  reservedFor,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocation != null) { sb.append("allocation:"); sb.append(allocation + ","); }
    if (deallocationRequested != null) { sb.append("deallocationRequested:"); sb.append(deallocationRequested + ","); }
    if (reservedFor != null && !reservedFor.isEmpty()) { sb.append("reservedFor:"); sb.append(reservedFor); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDeallocationRequested() {
    return withDeallocationRequested(true);
  }
  public class AllocationNested<N> extends V1alpha3AllocationResultFluent<AllocationNested<N>> implements Nested<N>{
    AllocationNested(V1alpha3AllocationResult item) {
      this.builder = new V1alpha3AllocationResultBuilder(this, item);
    }
    V1alpha3AllocationResultBuilder builder;
    
    public N and() {
      return (N) V1alpha3ResourceClaimStatusFluent.this.withAllocation(builder.build());
    }
    
    public N endAllocation() {
      return and();
    }
    
  
  }
  public class ReservedForNested<N> extends V1alpha3ResourceClaimConsumerReferenceFluent<ReservedForNested<N>> implements Nested<N>{
    ReservedForNested(int index,V1alpha3ResourceClaimConsumerReference item) {
      this.index = index;
      this.builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(this, item);
    }
    V1alpha3ResourceClaimConsumerReferenceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3ResourceClaimStatusFluent.this.setToReservedFor(index,builder.build());
    }
    
    public N endReservedFor() {
      return and();
    }
    
  
  }

}